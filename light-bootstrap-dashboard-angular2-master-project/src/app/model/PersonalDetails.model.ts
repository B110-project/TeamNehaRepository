import { Address } from "./Address.module";
import { PreviousLoanDetails } from "./PreviousLoanDetails.model";

export class PersonalDetails{

    personalDetailsId:number;
	firstName:string;;
	middleName:string;
	lastName:string;
	nameOfFather:string;
	nameOfMother:string;
	dob:string;
	gender:string;
	highestQualification:string;
    religion:string;
	nationality :string;
	aadhaarNo :string;
	panNo:string;
	maritalStatus :string;
	nameOfSpouse :string;
	numberOfChildren:string;
	employmentType:string;
	purposeOfLoan:string;
	
	customerAddress:Address;
	 previousLoans:PreviousLoanDetails;
}