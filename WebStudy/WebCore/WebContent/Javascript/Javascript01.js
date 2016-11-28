/**
 * 
 */
function Age(){
document.write("I am 22.");
}

function Alert(){
prompt("how old are you?","23"); 
/*for(var a=0;a<=10;a++){
alert("中毒了！");
confirm('sfsdfsfsfsdf');
	} */
//blur("1");
var p=window.createPopup();
focus("3");
moveBy("4");
open("5");
}

function Alert2(){
	alert("中毒了！");
	confirm('sfsdfsfsfsdf');
	prompt("how old are you?","23"); 
}

function getPoint(){
	var a=window.prompt("你打算点多少下？","20"); 
	for(var i=1;i<=a;i++){
		alert("你中毒了！");
	}
}

function NVGClose(){
	window.close();
}

function Close(){
	Windows.restar();
}

function Print(){
var str = window.prompt("请输入密码","password");
alert(str); 
}

function Student(name){
	this.name;
	this.getName=getName;
}
function getName(){
	return this.name;
}
function Button1_onclick() {
	var s=new Student("lijie",20,"asdad","13945655");
	alert(s.getName());
	alert(s.name);
}
function File(){
	var userInfo= newFile("D:\123\Equation2.txt")
	userInfo.open("w");
	if (userInput.error() == 0) {
		   fileIsOpen() }
		else {
		   fileIsNotOpen() }
		userInput.clearError() 

}
function File2(){
	dataFile = new File("D:\123\Equation2.txt");
	if (dataFile.exists() ==true) {
		   dataFile.open("w")
		   writeData()
		   dataFile.close()
		}
		else {
		   noFile()
		} 


	
}
