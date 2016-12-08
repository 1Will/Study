/**
 * 
 */
/*Index动画*/
$('#name').bind('mouseover', function() {
	$('#div3').show();
})
$('#name').bind('mouseout', function() {
	$('#div3').hide();
})
$('#password').bind('mouseover', function() {
	$('#div3').show();
})
$('#password').bind('mouseout', function() {
	$('#div3').hide();
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
					left : '79%',
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
	$('#ad1').show();
})
$('#li2').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad3').hide();
	$('#ad4').hide();
	$('#ad2').show();
})
$('#li3').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad4').hide();
	$('#ad3').show();
})
$('#li4').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad3').hide();
	$('#ad4').show();
})
$('#left').bind('mouseout', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad3').hide();
	$('#ad4').hide();
})
