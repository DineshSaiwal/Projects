package Base_Package;

public class Path {

//=========================================={  Common }============================================
	public static String Login_to_generate_JWT="/Utilities/LoginAPI/";
	public static String Verify_the_otp="/Utilities/VerifyOTPAPI/";
	public static String Resend_the_otp="/Utilities/SendOTPAPI/";
	public static String Change_Password="/Utilities/ChangePasswordAPI/";
	public static String Forgot_Password="/Utilities/ForgotPasswordAPI/";
	public static String Get_list_of_all_the_countries="/Utilities/CountriesAPI/";
	public static String Get_list_of_states_for_a_corresponding_country="/Utilities/StatesAPI/";
	public static String Get_list_of_cities_for_a_corresponding_country="/Utilities/CitiesAPI/";
	public static String Get_a_list_of_all_the_currency_codes="/Utilities/CurrencyCodesAPI/";
	
	
//=========================================={  Admin/Settings Department }============================================
	public static String Get_all_the_available_departments="/Utilities/DepartmentsAPI/";
	public static String Create_a_new_department="/Utilities/DepartmentsAPI/";
	public static String Update_an_existing_department="/Utilities/DepartmentsAPI/";
	public static String Delete_a_department="/Utilities/DepartmentsAPI/";
	public static String Get_a_list_of_departments_with_assigned_employees_and_team_leads="/Utilities/DepartmentsWithEmployeesAPI/";

//=========================================={  Admin/Settings Designations }============================================
	public static String Get_all_the_available_designations="/Utilities/DesignationsAPI/";
	public static String Create_a_new_designation="/Utilities/DesignationsAPI/";
	public static String Update_an_existing_designation="/Utilities/DesignationsAPI/";
	public static String Delete_a_designation="/Utilities/DesignationsAPI/";
	
//=========================================={  Admin/Settings Employee Details }============================================
	public static String Get_all_the_employee_personal_fields="/Utilities/EmployeePersonalFieldsAPI/";
	public static String Create_a_new_employee_personal_field="/Utilities/EmployeePersonalFieldsAPI/";
	public static String Update_an_existing_employee_personal_fields="/Utilities/EmployeePersonalFieldsAPI/";
	public static String Delete_a_employee_personal_fields="/Utilities/EmployeePersonalFieldsAPI/	";
	
	public static String Get_all_the_employee_Admin_fields="/Utilities/EmployeeAdminFieldsAPI/";
	public static String Create_a_new_employee_Admin_field="/Utilities/EmployeeAdminFieldsAPI/";
	public static String Update_an_existing_Admin_fields="/Utilities/EmployeeAdminFieldsAPI/";
	public static String Delete_a_Admin_fields="/Utilities/EmployeeAdminFieldsAPI/";
	
	public static String Get_all_the_available_Employement_types="/Utilities/EmployementTypesAPI/";
	public static String Create_a_new_Employemente_type="/Utilities/EmployementTypesAPI/";
	public static String Update_an_existing_Employement_type="/Utilities/EmployementTypesAPI/";
	public static String Delete_a_Employement_type="/Utilities/EmployementTypesAPI/";
	
//=========================================={  Admin/Settings/Leaves&Holidays Holiday Types }============================================
	public static String Get_all_the_available_holiday_types="/Utilities/HolidayTypesAPI/";
	public static String Create_a_new_holiday_type="/Utilities/HolidayTypesAPI/";
	public static String Update_an_existing_holiday_type="/Utilities/HolidayTypesAPI/";
	public static String Delete_a_holiday_type="/Utilities/HolidayTypesAPI/";

//=========================================={  Admin/Settings Performance }============================================
	public static String Get_all_the_available_Skill_types="/Utilities/SkillTypesAPI/";
	public static String Create_a_new_Skill_type="/Utilities/SkillTypesAPI/";
	public static String Update_an_existing_Skill_type="/Utilities/SkillTypesAPI/";
	public static String Delete_a_Skill_type="/Utilities/SkillTypesAPI/";
	
	public static String Get_all_the_available_Review_types="/Utilities/ReviewTypesAPI/";
	public static String Create_a_new_Review_type="/Utilities/ReviewTypesAPI/";
	public static String Update_an_existing_Review_type="/Utilities/ReviewTypesAPI/";
	public static String Delete_a_Review_type="/Utilities/ReviewTypesAPI/";
	
	public static String Get_all_the_available_Appraisal_types="/Utilities/AppraisalTypesAPI/";
	public static String Create_a_new_Appraisal_type="/Utilities/AppraisalTypesAPI/";
	public static String Update_an_existing_Appraisal_type="/Utilities/AppraisalTypesAPI/";
	public static String Delete_a_Appraisal_type="/Utilities/AppraisalTypesAPI/";
	
//=========================================={  Admin/Settings/ Company Details }============================================
	public static String Get_all_the_available_Company_domains="/Utilities/CompanyDomainsAPI/ ";
	public static String Create_a_new_Company_Domains="/Utilities/CompanyDomainsAPI/";
	public static String Update_an_existing_Company_Domains="/Utilities/CompanyDomainsAPI/";
	public static String Delete_a_Company_Domains="/Utilities/CompanyDomainsAPI/";
	
	public static String Get_the_details_of_the_logged_in_users_company="/Utilities/CompanyDetailsAPI/";
	public static String Update_the_details_of_the_logged_in_users_company="/Utilities/CompanyDetailsAPI/";	
	  
//=========================================={  Admin/Settings/Payroll Grades }============================================
	public static String Get_all_the_available_Grades="/Utilities/GradesAPI/";
	public static String Create_a_new_Grade="/Utilities/GradesAPI/";
	public static String Update_an_existing_Grade="/Utilities/GradesAPI/";
	public static String Delete_a_Grade="/Utilities/GradesAPI/";
	
///=========================================={  Admin/Settings/Payroll SalaryRange }============================================	
	public static String Get_all_the_available_SalaryRange="/Utilities/SalaryRangeAPI/?is_ascending=False";
	public static String Create_a_new_SalaryRange="/Utilities/SalaryRangeAPI/";
	public static String Update_an_existing_SalaryRange="/Utilities/SalaryRangeAPI/";
	public static String Delete_a_SalaryRange="/Utilities/SalaryRangeAPI/";
	
//=========================================={  Admin/Settings Profile }============================================	
	public static String Get_admin_user_specific_information="/Utilities/AdminUserAPI/";
	public static String Update_admin_user_specific_information="/Utilities/AdminUserAPI/";
	
//=========================================={  Admin/Registration  }============================================	
/*	public static String Register_a_new_super_admin="/Utilities/RegisterSuperAdminAPI/";
	public static String Register_a_new_admin_user="/Utilities/RegisterAdminAPI/";*/
	
//=========================================={  Admin/Employee/CRUD  }============================================	
	public static String Get_all_the_employees="/Employees/EmployeesAPI/";
/*	public static String Add_a_new_employee="/Employees/EmployeesAPI/";*/
	public static String Update_an_employee="/Employees/EmployeesAPI/";
	public static String Delete_an_employee="/Employees/EmployeesAPI/";
	
//=========================================={  Admin/Employee/WTD  }============================================	
	public static String Get_an_employees_wdt_info="/Employees/EmployeesWDTAPI/";
	/*public static String Update_an_employees_wdt_info="/Employees/EmployeesWDTAPI/";*/
	
//=========================================={  Admin/Employee/Salary }============================================	
	public static String Get_an_employees_salary_info="/Employees/EmployeesSalaryAPI/";
	/*public static String Update_an_employees_salary_info="/Employees/EmployeesSalaryAPI/";*/
	public static String Get_the_salary_breakup_for_the_employee="/Employees/SalaryBreakupAPI?employment_type_id=1&grade_id=2";

//=========================================={  Admin/Employee/Permissions }============================================	
	public static String Get_an_employees_permissions_info="/Employees/EmployeesPermissionsAPI/";
	public static String Update_an_employees_permissions_info="/Employees/EmployeesPermissionsAPI/";

//=========================================={  Admin/Employee/Performance/Report/CRUD }============================================	
	public static String Get_all_the_performance_reports="/Employees/PerformanceReportAPI/";
/*	public static String Add_a_new_performance_report="/Employees/PerformanceReportAPI/";*/
	public static String New_Update_performance_report_direct="/Employees/PerReportUpdateAPI/";
/*	public static String Update_a_performance_report="/Employees/EmployeesAPI/";
*/	public static String Delete_a_performance_report="/Employees/EmployeesAPI/";
	
//=========================================={  Admin/Employee/Performance/Performance Report/ObjectiveRating   }============================================	
	public static String Get_all_the_available_kras="/Employees/ObjectiveRatingAPI/";
	public static String Create_a_new_kra="/Employees/ObjectiveRatingAPI/";
	public static String Update_an_existing_kra="/Employees/ObjectiveRatingAPI/";
	public static String Delete_a_kra="/Employees/ObjectiveRatingAPI/";
	
//=========================================={  Admin/Employee/Performance/Performance Report/Behavioural Ratings   }============================================	
	public static String Get_all_the_available_BehaviouralRating="/Employees/BehaviouralRatingAPI/";
	public static String Create_a_new_BehaviouralRating="/Employees/BehaviouralRatingAPI/";
	public static String Update_an_existing_BehaviouralRating="/Employees/BehaviouralRatingAPI/";
	public static String Delete_a_BehaviouralRating="/Employees/BehaviouralRatingAPI/";
	
//=========================================={  Admin/Employee/Performance/Performance Report/Key Research Area(KRA) Goals   }============================================	
	public static String Get_all_the_available_kras_Goals="/Employees/KRAGoalsAPI/";
	public static String Create_a_new_kra_Goal="/Employees/KRAGoalsAPI/";
	public static String Update_an_existing_kra_Goal="/Employees/KRAGoalsAPI/";
	public static String Delete_a_kra_Goal="/Employees/KRAGoalsAPI/";

//=========================================={  Admin/Employee/Performance/Appraisal Reports  }============================================	
	public static String Get_all_the_appraisal_reports="/Employees/AppraisalReportAPI/";
	public static String Add_a_new_appraisal_report="/Employees/AppraisalReportAPI/";
	public static String Update_an_appraisal_report="/Employees/AppraisalReportAPI/";
	public static String Delete_an_appraisal_report="/Employees/AppraisalReportAPI/";

//=========================================={  Admin/Employee/Employee List  }============================================	
	public static String General_List_of_Employees="/Employees/GeneralListOfEmps/";
	public static String Get_list_of_reporters_available="/Employees/ReportsListAPI/";
		
//=========================================={  Admin/Calendar/Leave/Leave Modules  }============================================	
	public static String Get_all_the_Leave_Modules="/Calender/LeaveModulesAPI/";
	public static String Add_a_new_Leave_Module="/Calender/LeaveModulesAPI/";
	public static String Update_a_Leave_Module="/Calender/LeaveModulesAPI/";
	public static String Delete_a_Leave_Module="/Calender/LeaveModulesAPI/";
	
//=========================================={  Admin/Calendar/Leaves/Leave Types  }============================================	
	public static String Get_all_the_available_leave_types="/Calender/LeaveTypesAPI/";
	public static String Create_a_new_Leave_type="/Calender/LeaveTypesAPI/";
	public static String Update_an_existing_leave_type="/Calender/LeaveTypesAPI/";
	public static String Delete_a_leave_type="/Calender/LeaveTypesAPI/";
		
//=========================================={  Admin/Calendar/Events  }============================================	
	public static String Get_all_the_available_events="/Calender/EventsAPI/";
/*	public static String Create_a_new_Event="/Calender/EventsAPI/";
	public static String Update_an_existing_event="/Calender/EventsAPI/";*/
	public static String Delete_an_event="/Calender/EventsAPI/";
	
//=========================================={  Admin/Organisation/Payroll CRUD  }============================================	
	/*public static String Get_all_the_payrolls="/Organisation/PayRollAPI/";
	public static String Add_a_new_payroll="/Organisation/PayRollAPI/"; 
	public static String Delete_a_payroll="/Organisation/PayRollAPI/"; 
	public static String Update_a_payroll="/Organisation/PayRollAPI/"; */
	
//=========================================={  Admin/Organisation/Payroll Employees}============================================	
	public static String Ge_list_of_employees_for_a_payroll="/Organisation/EmployeesPayRollAPI/"; 
/*	public static String Add_or_update_an_employee_modification_entry="/Organisation/EmployeesPayRollAPI/"; 
	public static String Approve_a_payroll="/Organisation/ApprovePayRollAPI/"; */
	
//=========================================={  Admin/Organisation/Salary Components/ CRUD }============================================
	public static String Get_all_the_salary_components="/Organisation/SalaryComponentsAPI/"; 
/*	public static String Add_a_new_salary_component="/Organisation/SalaryComponentsAPI/"; 
	public static String Update_a_salary_component="/Organisation/SalaryComponentsAPI/";*/ 
	public static String Delete_a_salary_component="/Organisation/SalaryComponentsAPI/"; 
			
//==================={  Admin/Organisation/Salary Components/Components Distribution }============================================	
	public static String Get_component_distribution_info="/Organisation/ComponentsDistributionAPI/";
/*	public static String Add_a_new_component_distribution_obj="/Organisation/ComponentsDistributionAPI/";
	public static String Update_a_component_distribution_obj="/Organisation/ComponentsDistributionAPI/";*/
	public static String Delete_a_component_distribution_obj="/Organisation/ComponentsDistributionAPI/";

//====================={  Admin/Organisation/Salary Components/Policies/ CRUD }============================================	
	public static String Get_the_policies_of_the_company="/Organisation/PolicyAdminAPI/";
	public static String Add_a_new_policy_for_the_company="/Organisation/PolicyAdminAPI/";
	public static String Update_a_leave_policy="/Organisation/PolicyAdminAPI/";
	public static String Delete_a_Leave_policy="/Organisation/PolicyAdminAPI/";
	
//========================{  Admin/Organisation/Salary Components/Policies/ Employee Signatures }============================================	
	public static String employee_signatures_for_a_policy="/Organisation/PolicySignaturesAdminAPI/";
/*	public static String Add_an_new_employee_signature="/Organisation/PolicySignaturesAdminAPI/";
	public static String Update_an_employee_signatures="/Organisation/PolicySignaturesAdminAPI/";
	public static String Delete_an_employee_signature="/Organisation/PolicySignaturesAdminAPI/";
*/	
	public static String Get_the_organisation_chart="/Organisation/OrganisationChartAPI/";
	
//========================================{  Admin/Repository/Root Folder/CRUD }============================================	
	public static String Get_all_the_folders="/Repository/FoldersAPI/";
	public static String Add_an_new_folder="/Repository/FoldersAPI/";
	public static String Update_a_folder="/Repository/FoldersAPI/";
	public static String Delete_a_folder="/Repository/FoldersAPI/";
	
//==========================================={  Admin/Repository/Root Folder/Member }============================================		
	public static String Get_all_the_folder_members="/Repository/FolderMembersAPI/";
	public static String Add_an_new_folder_member="/Repository/FolderMembersAPI/";
	public static String Delete_a_folder_member="/Repository/FolderMembersAPI/";

//========================================={  Admin/Repository/Directories}============================================		
/*	public static String Get_all_the_directories="/Repository/DirectoryAPI/";		
	public static String Add_a_new_folder="/Repository/DirectoryAPI/";
	public static String Copy_a_file_or_folder="/Repository/DirMovCopyAPI/";
	public static String Move_a_file_or_folder="/Repository/DirMovCopyAPI/";
	public static String Renaming_a_sub_folder_or_file="/Repository/DirectoryAPI/";
	public static String Delete_a_directory_or_file="/Repository/DirectoryAPI/";*/
	
//========================================{  Admin/Blogs/CRUD  }============================================		
	public static String Get_all_the_blogs_of_the_company="/Blogs/AdminBlogsAPI/";
	public static String Add_a_new_blog="/Blogs/AdminBlogsAPI/";
	public static String Update_a_blog="/Blogs/AdminBlogsAPI/";
	public static String Delete_a_blog="/Blogs/AdminBlogsAPI/";

	public static String Publish_a_blog="/Blogs/AdminPublishBlogAPI/";
	
//========================================{  Admin/Project/CRUD  }============================================			
	public static String Get_all_the_Projects="/Projects/ProjectsAPI/";
	public static String Add_an_new_Project="/Projects/ProjectsAPI/";
	public static String Update_a_Project="/Projects/ProjectsAPI/";
	public static String Delete_a_Project="/Projects/ProjectsAPI/";
		
//========================================{  Admin/Project/Project Member  }============================================			
	public static String Get_all_the_project_members="/Projects/ProjectMembersAPI/";
	public static String Add_an_new_project_member="/Projects/ProjectMembersAPI/";
	public static String Delet_a_project_member="/Projects/ProjectMembersAPI/";
		
//========================================{  Admin/Project/Taskboard CRUD  }============================================
	
	/*=============================={Task board api is not working with super admin credentials }==========================*/
	
	public static String Get_all_the_taskboard="/Projects/TaskBoardAPI/";
	public static String Add_an_new_taskboard="/Projects/TaskBoardAPI/";
	public static String Update_a_taskboard="/Projects/TaskBoardAPI/";
	public static String Delete_a_taskboard="/Projects/TaskBoardAPI/";

		
//========================================{  Admin/Project/Taskboard Member  }============================================			
	public static String Get_all_the_taskboard_members="/Projects/TaskBoardMembersAPI/";
	public static String Add_an_new_taskboard_member="/Projects/TaskBoardMembersAPI/";
	public static String Delete_a_taskboard_member="/Projects/TaskBoardMembersAPI/";
	
//========================================{  Admin/Project/Task/Task CRUD  }============================================			
	public static String Get_all_the_task="/Projects/TasksAPI/";
	/*public static String Add_an_new_task="/Projects/TasksAPI/";
	public static String Update_a_task="/Projects/TasksAPI/";*/
	public static String Delete_a_task="/Projects/TasksAPI/";
		
//========================================{  Admin/Project/Task/Buckets  }============================================			
	public static String Get_all_the_buckets="/Projects/BucketsAPI/";
	public static String Add_a_new_bucket="/Projects/BucketsAPI/";
	public static String Update_a_bucket="/Projects/BucketsAPI/";
	public static String Delete_a_bucket="/Projects/BucketsAPI/";
	
//========================================{  Admin/Project/Task/Task DND  }============================================			
	public static String Get_all_the_tasks_sorted_for_a_specific_section="/Projects/TasksDnDAPI/";
	public static String Move_a_task_from_one_section_to_other="/Projects/TasksDnDAPI/";
	
//========================================{  Admin/Project/Task/Task Member  }============================================			
	/*	Unable to fetch task member already told to amin	
	 * public static String Ge_all_the_task_members="/Projects/TaskMembersAPI/";
	public static String Add_an_new_task_member="/Projects/TaskMembersAPI/";
	public static String Delete_a_task_member="/Projects/TaskMembersAPI/";*/
	
//========================================{  Admin/Project/Task/task_Checklist}============================================			
	public static String Get_all_the_task_Checklist="/Projects/TaskChecklistAPI/";
	public static String Add_an_new_task_Checklist="/Projects/TaskChecklistAPI/";
	public static String Update_an_new_task_Checklist="/Projects/TaskChecklistAPI/";
	public static String Delete_a_task_Checklist="/Projects/TaskChecklistAPI/";

//========================================{  Admin/Project/Task/TaskAttachments}============================================				
	public static String Get_all_the_Task_Attachments="/Projects/TaskAttachmentsAPI/";
	public static String Add_an_new_Task_Attachment="/Projects/TaskAttachmentsAPI/";
	public static String Update_an_Task_Attachment="/Projects/TaskAttachmentsAPI/";
	public static String Delete_a_Task_Attachment="/Projects/TaskAttachmentsAPI/";
		
//========================================{  Admin/Project/Task/TaskAttachments}============================================					
	public static String Get_all_the_Task_Comments="/Projects/TaskCommentsAPI/";
	public static String Add_an_new_Task_Comment="/Projects/TaskCommentsAPI/";
	public static String Update_an_Task_Comment="/Projects/TaskCommentsAPI/";
	public static String Delete_a_Task_Comment="/Projects/TaskCommentsAPI/";
			
	public static String Get_the_list_of_projects="/Projects/ListOfProjectsAPI/";
	public static String Get_the_chart_data_for_a_specific_taskboard="/Projects/TaskBoardChartsAPI/";
	
//========================================{User/Employee information/Personal  }============================================						
	public static String Get_Employee_information="/Employees/EmployeesPersonalAPI/";
	public static String Update_employee_info="/Employees/EmployeesPersonalAPI/";
	
//========================================{User/Employee information/Bank  }============================================						
	public static String Get_the_bank_details="/Employees/BankDetailsAPI/";
	public static String Add_the_bank_details="/Employees/BankDetailsAPI/";
	public static String Update_the_bank_details="/Employees/BankDetailsAPI/";
	
//========================================{User/Employee information/Education Details  }============================================							
	public static String Get_the_education_details="/Employees/EducationDetailsAPI/";
	public static String Add_the_education_details="/Employees/EducationDetailsAPI/";
	public static String Update_the_education_details="/Employees/EducationDetailsAPI/";
			
//========================================{User/Employee information/Prof Exp Details  }============================================							
	public static String Get_the_p_exp_details="/Employees/ProfExpDetailsAPI/";
	public static String Add_the_p_exp_details="/Employees/ProfExpDetailsAPI/";
	public static String Update_the_p_exp_details="/Employees/ProfExpDetailsAPI/";
		
//========================================{User/Employee information/Emergency Details  }============================================								
	public static String Get_the_emergency_contact_details="/Employees/EmergencyDetailsAPI/";
	public static String Add_the_emergency_contact_details="/Employees/EmergencyDetailsAPI/";
	public static String Update_the_emergency_contact_details="/Employees/EmergencyDetailsAPI/";
	
//========================================{User/Employee information/Family Details}============================================								
	public static String Get_the_family_details="/Employees/FamilyDetailsAPI/";
	public static String Add_the_family_details="/Employees/FamilyDetailsAPI/";
	public static String Update_the_family_details="/Employees/FamilyDetailsAPI/";

//========================================{User/Employee information/Family Details}============================================									
	public static String Get_the_medical_details="/Employees/MedicalDetailsAPI/";
	public static String Add_the_medicals_details="/Employees/MedicalDetailsAPI/";
	public static String Update_the_medical_details="/Employees/MedicalDetailsAPI/";
	
//========================================{User/Leave}============================================									
	public static String Get_the_leaves_for_the_employees="/Employees/EmployeeLeavesAPI/";
	public static String Apply_a_leave="/Employees/EmployeeLeavesAPI/";
	public static String Update_the_leave_as_the_employee="/Employees/EmployeeLeavesAPI/";
	public static String Update_a_leave="/Employees/EmpAppliedLeavesAPI/";
	public static String Get_all_the_applied_leaves_of_the_employee="/Employees/EmpAppliedLeavesAPI/";
	public static String Get_the_excel_file_for_emp_applied_leaves="/Employees/LeavesExcelAPI/";

//========================================{User/Policy}============================================									
	public static String Get_the_information_related_to_the_policies_of_the_employee="/Organisation/PolicyEmployeeAPI/";
	public static String Update_the_employee_policy_sign="/Organisation/PolicyEmployeeAPI/";

//========================================{User/Dashboard/Total Leave}============================================									
	public static String Get_the_information_related_of_the_leaves="/Dashboard/DashLeavesAPI/";
	
//========================================{User/Dashboard/DashTeamMem}============================================									
	public static String Get_the_list_of_team_members_who_are_on_leave="/Dashboard/DashTeamMemLeavesAPI/";
	
//========================================{User/Dashboard/Upcoming Events }============================================									
	public static String Get_the_list_of_upcoming_events="/Dashboard/DashUpcomingEventsAPI/";
			
//========================================{User/Dashbboard/Activity Tracker}============================================									
	public static String Get_all_the_activites_of_the_user="/Dashboard/ActivityTrackerAPI/";
	public static String Add_a_new_activity="/Dashboard/ActivityTrackerAPI/";
	public static String Update_an_activity="/Dashboard/ActivityTrackerAPI/";
	public static String Delete_an_activity="/Dashboard/ActivityTrackerAPI/";
	
//========================================{User/Dashbboard/Skill Metrics/My skills}============================================									
	public static String Get_all_the_skills="/Employees/EmployeeSkillsAPI/";
	public static String Add_a_new_skill="/Employees/EmployeeSkillsAPI/";
	public static String Update_a_skill="/Employees/EmployeeSkillsAPI/";
	public static String Delete_a_skill="/Employees/EmployeeSkillsAPI/";

//========================================{User/Dashbboard/Skill Metrics/skill Development}============================================									
	public static String Get_all_the_skill_Development="/Employees/EmployeeSkillDevAPI/";
	public static String Add_a_new_skill_Development="/Employees/EmployeeSkillDevAPI/";
	public static String Update_a_skill_Development="/Employees/EmployeeSkillDevAPI/";
	public static String Delete_a_skill_Development="/Employees/EmployeeSkillDevAPI/";
	public static String Get_all_the_tasks_of_the_user="/Dashboard/TodaysTasksAPI/";

//========================================{User/Employee Pay Slips}============================================									
	public static String Get_the_payslips_of_the_employee="/Employees/EmployeePaySlipsAPI/";
	public static String Get_list_of_years="/Organisation/YearsPayRollAPI/";
	
//========================================{User/Blogs}============================================									
	public static String Get_all_the_blogs_of_the_emplyoee="/Blogs/EmployeeBlogsAPI/";
	public static String Add_a_new_Employee_blog="/Blogs/EmployeeBlogsAPI/";
	public static String Update_a_Employee_blog="/Blogs/EmployeeBlogsAPI/";
	public static String Delete_an_Employee_blog="/Blogs/EmployeeBlogsAPI/";
	
//========================================{  Blogs  }============================================									
	public static String Get_all_the_blogs="/Blogs/GetBlogsAPI/";
	public static String Get_blogs_except_the_current_blog="/Blogs/GetMoreBlogsAPI";
			
//========================================{  Super Admin/Organization/All Companies   }============================================									
	public static String Get_all_the_companies_of_the_organisation="/Utilities/OrganisationsAPI/";
	public static String Get_a_list_of_all_the_companies_for_dropdown="/Utilities/OrganisationsListAPI/";
	
//========================================{  Super Admin/Organization/Change super admin   }============================================									
/*	public static String Change_the_super_admin="/Utilities/ChangeSuperAdminAPI/";*/
		
//========================================{  Super Admin/Organization/Department   }============================================									
	public static String Get_all_the_departments_of_the_companies="/Utilities/OrganisationsDepartmentsAPI/";
		
//========================================{  Super Admin/Organization/Emp Types   }============================================									
	public static String Get_all_the_emp_types_of_the_companies="/Utilities/OrganisationsEmpTypesAPI/";
		
//========================================{  Super Admin/Organization/Emp Types   }============================================									
	public static String Get_all_the_designations_of_the_companies="/Utilities/OrganisationsDesAPI/";
	
//========================================{  Super Admin/Organization/Grade   }============================================									
	public static String Get_all_the_grades_of_the_companies="/Utilities/OrganisationsGradesAPI/";
		
//========================================{  Super Admin/Organization/Policies   }============================================									
	public static String Get_all_the_policies_of_the_companies="/Utilities/OrganisationsPoliciesAPI/";
	
/*		
//========================================{  Mails/Send Mail}============================================									
	public static String Send_new_mail="/Mails/SendMailAPI/";
	public static String Save_as_draft="/Mails/SendMailAPI/";

//========================================{  Mails/Fetch Mail}============================================									
	public static String Get_User_Mails="/Mails/FetchMailsAPI/";
	public static String Inbox_mails="/Mails/InboxMailsAPI/";
	public static String Search_Mails="/Mails/SearchMailsAPI/";

//========================================{  Mails/Modify and Store mail }============================================									
	public static String Archive_Send_Delete_Pin_Favorite_Read="/Mails/UpdateMailstatus/";
	
//========================================{  Mails/Mail Folder }============================================									
	public static String Create_New_Mail_folder="/Mails/MailFoldersAPI/";
	public static String Get_folder_Mails="/Mails/MailFoldersAPI/";
	public static String Add_Mail_to_Folder="/Mails/MailFoldersAPI/";
	public static String Delete_a_Mail_Folder="/Mails/MailFoldersAPI/";
/********************************************************************************************************************
 * ******************************************************************************************************************
 * ******************************************************************************************************************	
 */
	
	
	
	
	
	
	
	
}
