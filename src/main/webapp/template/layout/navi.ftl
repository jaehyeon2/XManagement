<#-- <@spring.message "system.config.environment"/>-->
<br/>

<nav>
<div class="container-fluid">
  <ul class="navi_ul">
  	<li class="navi_li">li1</li>
  	<li class="navi_li">li2</li>
  	<li class="navi_li">li3</li>
  <ul>
</div>
<#if model??>
<div class="user_info">
	<span class="user_name">${model.user.userName}</span>
</div>
</#if>
</nav>