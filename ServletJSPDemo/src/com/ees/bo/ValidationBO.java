package com.ees.bo;

public class ValidationBO {
	
	public String validateGender(String gender1, String errors) {
		if (isEmptyField(gender1)) {
			errors += "Gender Can't be blank <br/>";
		}
		return errors;
	}

	public String validateMiddleName(String middleName1, String errors) {
		if (isEmptyField(middleName1)) {
			errors += "Middle Name Can't be blank <br/>";
		}
		return errors;
	}

	public String validateLastName(String lastName1, String errors) {
		if (isEmptyField(lastName1)) {
			errors += "Last Name Can't be blank <br/>";
		}
		return errors;
	}

	public String validateFirstName(String firstName1, String errors) {
		if (isEmptyField(firstName1)) {
			errors += "First Name Can't be blank <br/>";
		}
		return errors;
	}

	public boolean isEmptyField(String fieldvalue) {
		return fieldvalue == null || fieldvalue.trim().length() == 0;
	}
	
	public String validatePhone(String phone1, String errors) {
		if (isEmptyField(phone1)) {
			errors += "Phone Can't be blank <br/>";
		}
		return errors;
	}

	public String validateCountry(String country1, String errors) {
		if (isEmptyField(country1)) {
			errors += "Country Can't be blank <br/>";
		}
		return errors;
	}

	public String validateState(String state1, String errors) {
		if (isEmptyField(state1)) {
			errors += "state Can't be blank <br/>";
		}
		return errors;
	}

	public String validateCity(String city1, String errors) {
		if (isEmptyField(city1)) {
			errors += "City Can't be blank <br/>";
		}
		return errors;
	}

	public String validateAddress(String address1, String errors) {
		if (isEmptyField(address1)) {
			errors += "Address Can't be blank <br/>";
		}
		return errors;
	}

	

	public String validateSSN(String ssn1, String errors) {
		if (isEmptyField(ssn1)) {
			errors += "SSN Can't be blank <br/>";
		}
		return errors;
	}

	public String validateAccountNo(String accountNo1, String errors) {
		if (isEmptyField(accountNo1)) {
			errors += "Account No Can't be blank <br/>";
		}
		return errors;
	}

	public String validateBankName(String bankname1, String errors) {
		if (isEmptyField(bankname1)) {
			errors += "Bank Name Can't be blank <br/>";
		}
		return errors;
	}

	
}
