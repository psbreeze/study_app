var exam;
var currentIdx = 0;
var currentItem;

var answerList = [];

function shuffle(a) {
    var j, x, i;
    for (i = a.length; i; i--) {
        j = Math.floor(Math.random() * i);
        x = a[i - 1];
        a[i - 1] = a[j];
        a[j] = x;
    }
}

function doTest()
{
	var right = true;
	
	for (var i=0;i<4;i++)
	{
		var chk = $("#chk_" + i);
		
		if (chk.prop("answer"))
		{
			$("#text_"+i).css("color", "red");
		}
		
		if (chk.prop("answer") != chk.prop("checked"))
		{
			right = false;
		}
		
	}
	
	return right;
}

function showItem(idx)
{
	if (idx == 40)
	{
		showResult();
		return;
	}

	answerList[idx] = true;
	
	var item = exam[idx];
	currentItem = item;
	currentItem.answers = [
		{'text': item.AText, 'answer': item.A == "0" ? false : true},
		{'text': item.BText, 'answer': item.B == "0" ? false : true},
		{'text': item.CText, 'answer': item.C == "0" ? false : true},
		{'text': item.DText, 'answer': item.D == "0" ? false : true},
	];
	
	shuffle(currentItem.answers);
	
	$("#question").text(currentItem.Question);
	
	for (var i=0;i<4;i++)
	{
		$("#chk_" + i).prop("checked", false)
		$("#text_" + i).text(currentItem.answers[i].text);
		$("#text_"+i).css("color", "black");
		$("#chk_" + i).prop("answer", currentItem.answers[i].answer);
	}
	
	currentIdx = idx;
}

function showResult()
{
	$("#result_div").show();
	$("#main_div").hide();
	
	var correct = 0;
	var wrong = 0;
	
	for (var i=0;i<answerList.length;i++)
	{
		if (answerList[i])
		{
			correct++;
		}
		else
		{
			wrong++;
		}
	}
	
	var total = correct + wrong;
	if (total != 0)
	{
		var chk = correct / total;
		if (chk >= 0.6)
		{
			$("#result_passfail").text("Pass (" + parseInt(chk * 100) + ")");
			$("#result_passfail").css("color", "blue");
		}
		else
		{
			$("#result_passfail").text("Fail (" + parseInt(chk * 100) + ")");
			$("#result_passfail").css("color", "red");
		}
	}
	else
	{
		$("#result_passfail").text("");
	}
	
	$("#result_correct").text("Correct: " + correct);
	$("#result_wrong").text("Wrong: " + wrong);
}

function onLoad()
{
	$("#next").click(function() {
		if (doTest() == false)
		{
			answerList[currentIdx] = false;
		}
		else
		{
			showItem(currentIdx + 1);
		}
	});
	
	$("#test").click(function() {
		if (doTest() == false)
		{
			answerList[currentIdx] = false;
		}
	});
	
	currentIdx = 0;
	$.ajax("/api/exam").done(function(ret) {
		exam = JSON.parse(ret).result;
		shuffle(exam);
		showItem(currentIdx);
	});
}