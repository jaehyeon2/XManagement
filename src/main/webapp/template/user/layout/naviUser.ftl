<#-- <@spring.message "system.config.environment"/>-->
<br/>

<nav>
<div class="user_navi_list">
	<ul class="menu_area">
		<li class="m1" id="menu_1"><a href="/dashboard">menu1</a></li>
		<li class="m1" id="menu_2"><a href="/company">menu2</a></li>
		<li class="m1" id="menu_3"><a href="/user">menu3</a></li>
		<li class="m1" id="menu_4"><a href="">menu4</a></li>
		<#if model?? && model.user.userAuth!='9'>
		<li class="admin" id="admin_mode"><a href="/admin/dashboard">관리자 모드</a></li>
		</#if>
	</ul>
</div>
<#if model??>
<div class="user_info">
	<span class="user_name">${model.user.userName?if_exists}</span>
</div>
</#if>
</nav>