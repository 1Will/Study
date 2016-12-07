/**
 * 
 */
/*Index动画*/
$('#load').bind('click', function() {
	$('#h4h').show("slow");
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
	$('#ad1').show('fast');
})
$('#li2').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad3').hide();
	$('#ad4').hide();
	$('#ad2').show('fast');
})
$('#li3').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad4').hide();
	$('#ad3').show('fast');
})
$('#li4').bind('mouseover', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad3').hide();
	$('#ad4').show('fast');
})
$('#left').bind('mouseout', function() {
	$('#ad1').hide();
	$('#ad2').hide();
	$('#ad3').hide();
	$('#ad4').hide();
})
