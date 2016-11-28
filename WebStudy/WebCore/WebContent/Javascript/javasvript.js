/**
 * 
 */
function createObjectURL(blob) {
    if (window.URL) {
        return window.URL.createObjectURL(blob);
    } else if (window.webkitURL) {
        return window.webkitURL.createObjectURL(blob);
    } else {
        return null;
    }
}

// 文件检测
function checkFile() {
    // 获取文件
    var file = $$("uploadFile").files[0];                            
    // 文件为空判断
    if (file === null || file === undefined) {
        alert("请选择您要上传的文件！");
        $$("btnSelect").innerHTML = "单击选择要上传的照片";
        return false;
    }
     
    // 检测文件类型
    if(file.type.indexOf('image') === -1) {
        alert("请选择图片文件！");
        return false;
    }
     
    // 计算文件大小
    var size = Math.floor(file.size/1024);        
    if (size > 5000) {
        alert("上传文件不得超过5M!");
        return false;
    };        
    // 添加预览图片
   /* $$("btnSelect").innerHTML = "<img class="\"photo\"" src="" style="display: none;"><img alt="加载中..." title="图片加载中..." src="http://statics.2cto.com/images/s_nopic.gif">";
*/};

// 监听图片URL地址更改
addEventListener($$("uploadFile"), "change", function() {                    
    checkFile();
});
 
// 监听单击文件选择按钮
addEventListener($$("btnSelect"), "click", function() {
    // 弹出文件选择框
    $$("uploadFile").click();
});
// 监听确认上传按钮的点击事件
addEventListener($$("btnConfirm"), "click", function(e) {    
 
    if (checkFile()) {        
        try {
            // 执行上传操作var xhr = createXHR();
            $$("maskLayer").style.display = "block";
            xhr.open("post","/uploadPhoto.action", true);
            xhr.setRequestHeader("X-Requested-With", "XMLHttpRequest");
            xhr.onreadystatechange = function() {
                if (xhr.readyState == 4) {
                    var flag = xhr.responseText;
                    if (flag == "success") {
                        alert("图片上传成功！");
                    } else {
                        alert("图片上传成功！");
                    };                        
                    $$("maskLayer").style.display = "none";
                };
            };
            // 表单数据
            var fd = new FormData();
            fd.append("myPhoto", $$("uploadFile").files[0]);
            // 执行发送
            xhr.send(fd);            
        } catch (e) {
            console.log(e);
        }
    }    
});