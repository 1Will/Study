/**
 * 
 */
/*Index动画*/
$('#name').bind('mouseover', function() {
	$('#div1').show();
})
$('#name').bind('mouseout', function() {
	$('#div1').hide();
})
$('#password').bind('mouseover', function() {
	$('#div1').show();
})
$('#password').bind('mouseout', function() {
	$('#div1').hide();
})

$('#password').bind('click', function() {
	$('#password').val('');
})

$(function() {
		$('body').bind('mouseover', function() {
			for (var a = 1; a <= 10; a++) {
				$('#divv').animate({
					top : '88%',
					left : '40%',
				}, 3000);
				$('#divv').animate({
					top : '40%',
					left : '81%',
				}, 3000);
				$('#divv').animate({
					top : '1%',
					left : '40%',
				}, 3000);
				$('#divv').animate({
					top : '40%',
					left : '1%',
				}, 3000);
			}
		});

	})

/*Index2动画*/
$('#li1').bind('mouseover', function() {
	$('#ad2').hide();
	$('#ad3').hide();
	$('#ad4').hide();
	$('#ad5').hide();
	$('#ad1').show();
})
$('#li2').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad3').hide();
	$('#ad4').hide();
	$('#ad5').hide();
	$('#ad2').show();
})
$('#li3').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad4').hide();
	$('#ad5').hide();
	$('#ad3').show();
})
$('#li4').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad3').hide();
	$('#ad5').hide();
	$('#ad4').show();
})
$('#li5').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad3').hide();
	$('#ad4').hide();
	$('#ad5').show();
})

$('#left').bind('mouseout', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad3').hide();
	$('#ad4').hide();
	$('#ad5').hide();
})


$('#game1').bind('click',function(){
	$('#iframe1').attr("src","game/game1.html");
})
