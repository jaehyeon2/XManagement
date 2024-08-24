<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="main_container">
	user
	<a href="/admin/user/addUser">사용자 등록</a>
	<#if model??>
	<div class="user_count">userCount = ${model.userCount?if_exists}</div>
	<#if model.userList??>
	<table class="user_table">
		<thead class="user_th">
			<td class="user_td">No</td>
			<td class="user_td">성명</td>
			<td class="user_td">이메일</td>
			<td class="user_td">연락처</td>
			<td class="user_td">소속</td>
		</th>
		<#list model.userList as user>
		<tr class="company_tr" onclick="location.href='/admin/user/detail?userNo=${user.userNo?if_exists}'">
			<td class="user_td">${user.userNo?if_exists}</td>
			<td class="user_td">${user.userName?if_exists}</td>
			<td class="user_td">${user.userEmail?if_exists}</td>
			<td class="user_td">${user.userPhone?if_exists}</td>
			<td class="user_td">${user.userParentNo?if_exists}</td>
		</tr>
		</#list>
	</table>
	<#else>
	user not exist
	</#if>
	
	</#if>
	
</div>

</@layout.myLayout>
