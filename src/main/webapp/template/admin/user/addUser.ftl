<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="main_container">
	
	<form action="/admin/user/addUser" method="post">
		<label>사용자 이름</label><input class="add-user-input" name="userName"></input>
		<label>사용자 이메일</label><input class="add-user-input" name="userEmail"></input>
		<label>사용자 이름</label><input class="add-user-input" name="userPhone"></input>
		<label>사용자 권한</label>
		<select name="userAuth">
			<option value='9'>일반</option>
			<option value='5'>관리자</option>
		</select>
		<label>사용자 직급</label>
		<select name="userPosition">
			<option value='1'>사장</option>
			<option value='6'>부사장</option>
			<option value='11'>부장</option>
			<option value='16'>차장</option>
			<option value='21'>과장</option>
			<option value='26'>대리</option>
			<option value='31'>주임</option>
			<option value='36'>사원</option>
			<option value='41'>인턴</option>
		</select>
		
		<button type="submit">등록</button>
	</form>
</div>

</@layout.myLayout>
