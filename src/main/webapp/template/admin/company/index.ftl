<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="main_container">
	<#if model??>
	<#list model.companyList?if_exists as company>
		<option value="${company.companyNo}">${company.companyName}</option>
	</#list>
	</#if>
</div>

</@layout.myLayout>
