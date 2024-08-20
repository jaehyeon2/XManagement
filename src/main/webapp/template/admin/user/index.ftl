<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="main_container">
	user
	<a href="/admin/user/addUser">사용자 등록</a>
	<#if model??>
	<div class="user_count">userCount = ${model.userCount?if_exists}</div>
	<#if model.userList??>
	<div class="user_list">
		<#list model.userList as user>
			<div class="user_info">userName = ${user.userName?if_exists}</div>
		</#list>
	</div>
	<#else>
	user not exist
	</#if>
	
	</#if>
	
</div>

</@layout.myLayout>
