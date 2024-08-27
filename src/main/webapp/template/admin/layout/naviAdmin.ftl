<#-- <@spring.message "system.config.environment"/>-->
<br/>

<nav>
<div class="admin_navi_list">
	<ul class="menu_area">
		<li class="m1" id="menu_1"><a href="/admin/dashboard">대시보드</a></li>
		<li class="m1" id="menu_2"><a href="/admin/company">회사 관리</a></li>
		<li class="m1" id="menu_3"><a href="/admin/user">사용자 관리</a></li>
		<li class="m1" id="menu_4"><a href="">다른 거</a></li>
	</ul>
</div>
<#if model??>
<div class="user_info">
	<#-- <span class="user_name">${model.sessionUser.userName?if_exists}</span> -->
</div>
</#if>
</nav>