<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<button class="add-btn btn" onclick="location.href='/admin/company/addCompany'">회사 추가</button>
<div class="main_container">
	<#if model??>
	<#list model.companyList?if_exists as company>
		<option value="${company.companyNo}">${company.companyName}</option>
	</#list>
	</#if>
</div>

</@layout.myLayout>
