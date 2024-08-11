<#import "/user/layout/layoutUser.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="main_container">
	<form id="loginForm" name="loginForm" action="/login/auth" method="post">
		<label>이메일</label><input type="text" class="login_input" id="userEmail" name="userEmail" value="${userEmail?if_exists}">
		</br>
		<label>비밀번호</label><input type="password" class="login_input" id="userPwd" name="userPwd">
		</br>
		<input type="submit" class="login_button" value="로그인">
	</form>
	<div class="login_error_message">
		${loginErrorMessage?if_exists}
	</div>
</div>

</@layout.myLayout>
