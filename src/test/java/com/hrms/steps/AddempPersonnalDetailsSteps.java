package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonFunctions;
import com.hrms.utils.Constants;
import com.hrms.utils.ExecelUtility;

import io.cucumber.java.en.When;

public class AddempPersonnalDetailsSteps extends CommonFunctions {

	@When("user add personnal employee details from {string} execl sheet")
	public void user_add_personnal_employee_details_from_execl_sheet(String exelPath) {
	


		List<Map<String, String>> exelListOfMaps = ExecelUtility.excelToLisOfMaps(Constants.EXCEL_FILE_PATH, exelPath);

		for (Map<String, String> Mapsdetails : exelListOfMaps) {
			if (pdetails.addedEmpName.getText().contains("Nora")) {

				click(pdetails.editOrSaveBtn);

				sendText(EmpPd.driverLicenceTextBoxN, Mapsdetails.get("driver licence number"));
				sendText(EmpPd.licenseExpirationDate, Mapsdetails.get("License Expiry Date"));
				sendText(EmpPd.dateOfBirth, Mapsdetails.get("dat of birth"));
				sendText(EmpPd.militaryServicetxtBox, Mapsdetails.get("Military service"));
				sendText(EmpPd.nickNameTxtbox, Mapsdetails.get("Nick name"));
				sendText(EmpPd.otherIdstext, Mapsdetails.get("Other id"));
				sendText(EmpPd.ssnNumber, Mapsdetails.get("Ssn number"));
				sendText(EmpPd.otherSsnNumber, Mapsdetails.get("Sin number"));

				sendText(EmpPd.otherIdstext, Mapsdetails.get("Other id"));

				selectDdvalue(EmpPd.maritalStatusDd, Mapsdetails.get("Marital Status"));
				selectDdvalue(EmpPd.nationalityDd, Mapsdetails.get("Nationality"));

				clickRadioOrCheckBox(EmpPd.genderRadioBtns, Mapsdetails.get("gender"));

				if (Mapsdetails.get("Smoker").equals("yes")) {
					click(EmpPd.smokerCheckBox);
				}

				click(EmpPd.editOrSaveBtn);
				break;
				// click(addEmp.addEmpBtn);

			} else if (pdetails.addedEmpName.getText().contains("Hamid")) {
				click(pdetails.editOrSaveBtn);

				sendText(EmpPd.driverLicenceTextBoxN, Mapsdetails.get("driver licence number"));
				sendText(EmpPd.licenseExpirationDate, Mapsdetails.get("License Expiry Date"));
				sendText(EmpPd.dateOfBirth, Mapsdetails.get("dat of birth"));
				sendText(EmpPd.militaryServicetxtBox, Mapsdetails.get("Military service"));
				sendText(EmpPd.nickNameTxtbox, Mapsdetails.get("Nick name"));
				sendText(EmpPd.otherIdstext, Mapsdetails.get("Other id"));
				sendText(EmpPd.ssnNumber, Mapsdetails.get("Ssn number"));
				sendText(EmpPd.otherSsnNumber, Mapsdetails.get("Sin number"));

				sendText(EmpPd.otherIdstext, Mapsdetails.get("Other id"));

				selectDdvalue(EmpPd.maritalStatusDd, Mapsdetails.get("Marital Status"));
				selectDdvalue(EmpPd.nationalityDd, Mapsdetails.get("Nationality"));

				clickRadioOrCheckBox(EmpPd.genderRadioBtns, Mapsdetails.get("gender"));

				if (Mapsdetails.get("Smoker").equals("yes")) {
					click(EmpPd.smokerCheckBox);
				}

				click(EmpPd.editOrSaveBtn);
				// click(addEmp.addEmpBt
				break;

			} else if(pdetails.addedEmpName.getText().contains("Ahmed")) {
				
				click(pdetails.editOrSaveBtn);

				sendText(EmpPd.driverLicenceTextBoxN, Mapsdetails.get("driver licence number"));
				sendText(EmpPd.licenseExpirationDate, Mapsdetails.get("License Expiry Date"));
				sendText(EmpPd.dateOfBirth, Mapsdetails.get("dat of birth"));
				sendText(EmpPd.militaryServicetxtBox, Mapsdetails.get("Military service"));
				sendText(EmpPd.nickNameTxtbox, Mapsdetails.get("Nick name"));
				sendText(EmpPd.otherIdstext, Mapsdetails.get("Other id"));
				sendText(EmpPd.ssnNumber, Mapsdetails.get("Ssn number"));
				sendText(EmpPd.otherSsnNumber, Mapsdetails.get("Sin number"));

				sendText(EmpPd.otherIdstext, Mapsdetails.get("Other id"));

				selectDdvalue(EmpPd.maritalStatusDd, Mapsdetails.get("Marital Status"));
				selectDdvalue(EmpPd.nationalityDd, Mapsdetails.get("Nationality"));

				clickRadioOrCheckBox(EmpPd.genderRadioBtns, Mapsdetails.get("gender"));

				if (Mapsdetails.get("Smoker").equals("yes")) {
					click(EmpPd.smokerCheckBox);
				}

				click(EmpPd.editOrSaveBtn);
				// click(addEmp.addEmpBt
				
				break;
			
			
			}else if(pdetails.addedEmpName.getText().contains("chakir")) {
				
				
				click(pdetails.editOrSaveBtn);

				sendText(EmpPd.driverLicenceTextBoxN, Mapsdetails.get("driver licence number"));
				sendText(EmpPd.licenseExpirationDate, Mapsdetails.get("License Expiry Date"));
				sendText(EmpPd.dateOfBirth, Mapsdetails.get("dat of birth"));
				sendText(EmpPd.militaryServicetxtBox, Mapsdetails.get("Military service"));
				sendText(EmpPd.nickNameTxtbox, Mapsdetails.get("Nick name"));
				sendText(EmpPd.otherIdstext, Mapsdetails.get("Other id"));
				sendText(EmpPd.ssnNumber, Mapsdetails.get("Ssn number"));
				sendText(EmpPd.otherSsnNumber, Mapsdetails.get("Sin number"));

				sendText(EmpPd.otherIdstext, Mapsdetails.get("Other id"));

				selectDdvalue(EmpPd.maritalStatusDd, Mapsdetails.get("Marital Status"));
				selectDdvalue(EmpPd.nationalityDd, Mapsdetails.get("Nationality"));

				clickRadioOrCheckBox(EmpPd.genderRadioBtns, Mapsdetails.get("gender"));

				if (Mapsdetails.get("Smoker").equals("yes")) {
					click(EmpPd.smokerCheckBox);
				}

				click(EmpPd.editOrSaveBtn);
				// click(addEmp.addEmpBt
			}
			break;
		}

	}

}
