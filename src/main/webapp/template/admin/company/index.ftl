<#import "/admin/layout/layoutAdmin.ftl" as layout>
<#import "/spring.ftl" as spring/>
<@layout.myLayout>

<button class="add-btn btn" onclick="location.href='/admin/company/addCompany'">회사 추가</button>
<div class="main_container">
	<#if model??>
	<#if model.companyList?has_content>
	<div class="admin_list2 th">
		<ul>
			<li>부서명</li>
			<li>부서 코드</li>
			<li>상위 부서</li>
			<li>등록일</li>
		</ul>
	</div>
	<#list model.companyList?if_exists as company>
	<div class="admin_list2 cursor" onClick="location.href='/admin/company/detail?companyNo=${company.companyNo?if_exists}'">
		<ul>
			<li>${company.companyName?if_exists}</li>
			<li>${company.companyCode?if_exists}</li>
			<#if company.companyParentName??>
			<li>${company.companyParentName?if_exists}</li>
			<#else>
			<li>없음(최상위 그룹입니다.)</li>
			</#if>
			<li>${company.insertDate?string('yyyy.MM.dd | HH:mm:ss')}</li>
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
