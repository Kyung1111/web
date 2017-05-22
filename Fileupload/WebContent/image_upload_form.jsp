<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>여러 사진 업로드폼11</h2>
<form action="${initParam.rootPath}/imageupload" method="post" enctype="multipart/form-data">
	업로더 : <input type="text" name="uploader"><br>
	설명 : <input type="text" name="comment" size="50"><br>
	사진 1 : <input type="file" name="image"><br>
	사진 2 : <input type="file" name="image"><br><!-- 다른 name으로 보내도 되는데 같은 역할을 하는 것이므로 같은 name설정이 관례.  -->
	사진 3 : <input type="file" name="image"><br>
	<input type="submit" value="전송">
</form>
</body>
</html>
