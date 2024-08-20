<#-- <@spring.message "system.config.environment"/>-->
<br/>

<nav>
<div class="container-fluid">
	admin mode
	<ul class="admin_navi_list">
		<li class="admin_navi"><a href="/admin/dashboard">대시보드</a></li>
		<li class="admin_navi"><a href="/admin/company">회사 관리</a></li>
		<li class="admin_navi"><a href="/admin/user">사용자 관리</a></li>
		<li class="admin_navi"><a href="">다른 거</a></li>
	<ul>
</div>
<#if model??>
<div class="user_info">
	<#-- <span class="user_name">${model.sessionUser.userName?if_exists}</span> -->
</div>
</#if>
</nav>