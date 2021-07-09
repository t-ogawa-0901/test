<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<h1>ログイン画面</h1>
<p>IDとパスワードを入力してください。</p>

<form action="Login.action" method="post">
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
<input type="submit" value="ログイン">
</form>
<br>
<p>新規登録の方は<a href="login-new.jsp">こちら</a>をクリック</p>

<%@include file="../footer.html" %>