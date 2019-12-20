import { CustomerDetails } from './CustomerDetails.model';

export class Loan {
    loanId: number;
    loanAmount: number;
    rateOfInterest: number;
    tenure: number;
    marginAmount: number;
    emiAmount: number;
    processingFees: number;
    otherCharges: number;
    totalAmount: number;
    leadNo: String;
    loanNo: String;
    loanType: String;
    status: number;
    customerDetails: CustomerDetails;
}
