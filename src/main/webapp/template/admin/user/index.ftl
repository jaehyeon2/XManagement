<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="main_container">
	<a href="/admin/user/addUser">사용자 등록</a>
	<#if model??>
	<div class="admin_user_num">
		<#if model.userCount??>
		<p>생성된 계정<span class="num">${model.userCount}</span></p>
		<#else>
		<p>생성된 계정<span class="num none">0</span></p>
		</#if>
	</div>
	<#if model.userList?has_content>
	<div class="admin_list1 th">
		<ul>
			<li>이름</li>
			<li>권한</li>
			<li>연락처</li>
			<li>이메일</li>
			<li>최종 접속 시간</li>
		</ul>
	</div>
	<#list model.userList as user>
	<div class="admin_list1 cursor" onClick="location.href='/admin/user/detail?userId=${user.userId?if_exists}&userDomain=${user.userDomain?if_exists}'">
		<ul>
			<li>${user.userName?if_exists}</li>
			<li><span class="c1">
			<#if user.userAuth?if_exists == "1">
				main
			<#else>
		        sub
			</#if>
			</span></li>
			<li>${user.userPhone?if_exists}</li>
			<li>${user.userEmail?if_exists}</li>
			<li>${user.insertDate?string('yyyy.MM.dd | HH:mm:ss')}</li>
		</ul>
	</div>
	</#list>
	<#else>
	<p>
		<span class="txt1">해당 정보가 존재하지 않습니다.</span>
	<p>
	</#if>
	</#if>
</div>

</@layout.myLayout>
