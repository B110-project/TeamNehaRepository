import { Address } from './Address.module';
import { BusinessDetails } from './BusinessDetails.module';
import { SalariedDetails } from './SalariedDetails.module';

export class Enquiry {

    enquiryId: number;
    firstName: string;
    middleName: string;
    lastName: string;
    panNo: string;
    aadharNo: string;
    mobileNo: string;
    emailId: string;
    gender: string;
    leadNo: string;
    statusCode: number;
    branchCode: string;
    loanAmount: number;
    loanType: string;
    employmentType: string;
    address: Address;
    salaried: SalariedDetails;
    business: BusinessDetails;
}
