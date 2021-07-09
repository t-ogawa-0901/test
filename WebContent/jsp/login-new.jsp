<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<h1>新規登録</h1>
<p>IDとパスワードを入力してください。</p>

<form action="Login.new" method="post">
<table><tr>
<td>ID</td>
<td>
<input type="text" name="login" size="40">
</td>
</tr><tr>
<td>パスワード</td>
<td>
<input type="password" name="password" size="40">
</td></tr>
</table>
<br>
<input type="submit" value="登録">
</form>

<%@include file="../footer.html" %>