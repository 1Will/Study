/**
 * 
 */
/*主页动画*/
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
