<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<div class="main_container">
	<form class="company_form form" action="/admin/company/addCompany" method="post">
		<label>회사명</label><input type="text" id="companyName" name="companyName"/>
		<label>회사코드</label><input type="text" id="companyCode" name="companyCode"/>
		<label>모회사</label>
		<select id="parentCompanyNo" name="parentCompanyNo">
		<#if model??>
		<#list model.companyList?if_exists as company>
			<option value="${company.companyNo}">${company.companyName}</option>
		</#list>
		</#if>
		</select>
		<button type="submit" class="submit-btn">제출</button>
	</form>
</div>

</@layout.myLayout>
