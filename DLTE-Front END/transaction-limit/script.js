var transac = []    // ARRAY
var cnt = 0;    //COUNT FOR HOW MANY TRANSACTION
var debCnt = 0; //Count FOR DEBITED
function limit(){
    let amt = document.forms['transaction'].amount.value;
    document.forms['transaction'].amount.value = "";
    transac[cnt] = +amt;    //INSERTING INTO ARRAY

    if(cnt==0){ 
        alert(amt +" credited.");
    }

    if(cnt>0){
        // if the current transaction amount is less than the previous one
        if(transac[cnt]<=transac[cnt-1]){
            // number of debit transactions have crossed 3
            if(debCnt>2){
                    alert("Debit limit reached\nYou will be charged Rs.20 extra");
                    alert(amt+" debited.")
                    debCnt += 1;
                }
            else{
                alert(amt+" debited.")
                debCnt += 1;
            }
        }
        else{
            alert(amt +" credited.")
        }
    }
    //Writing the history to the html
        cnt += 1;
}