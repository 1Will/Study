<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
	<form action="product_update2.action" method="post">
	<fieldset>
		<legend>Update product</legend>
		<input type="hidden"  id="name" name="id" value="${product.id}">
		
		<label for="name">Product Name:</label>
		<input type="text"  id="name" name="name" value="${product.name}" tabindex="1" />
		
		<label for="description">Description:</label>
		<input type="text"  id="description" name="description" value="${product.description}" tabindex="2" />
		
		<label for="price">Price:</label>
		<input type="text"  id="price" name="price" value="${product.price}" tabindex="3" />

		<label for="weight">Weight:</label>
		<input type="text"  id="weight" name="weight" value="${product.weight}" tabindex="3" />
		
		<label for="size">Size:</label>
		<input type="text"  id="size" name="size" value="${product.size}" tabindex="3" />
		
		<div id="buttons">
		<label for="dummy" > </label>
		<input id="reset" type="reset"  tabindex="4"/>
		<input id="submit" type="submit" tabindex="5" value="Update Product" />
		</div>
	</fieldset>
	</form>
	</div>
</body>
</html>