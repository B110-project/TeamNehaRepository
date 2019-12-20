import { FamilyDetails } from './FamilyDetails.module';
import { CustomerBankDetails } from './CustomerBankDetails.model';
import { DocumentDetails } from './DocumentDetails.model';
import { PreviousLoanDetails } from './PreviousLoanDetails.model';
import { PersonalDetails } from './PersonalDetails.model';

export class CustomerDetails {
    customerId: number;
    customerFamily: FamilyDetails;
    customerPersonal: PersonalDetails;
    customerPreviousLoans: PreviousLoanDetails;
    customerDocs: DocumentDetails;
    bankDetails: CustomerBankDetails;
}
