$(document).ready(function(){
    showDataPicker();
    lireMoinsEtPlus();
});

function showDataPicker(){
    $(function(){
        
        $('#date').datepicker({
            format:'dd/mm/yyyy',
           startDate:new Date()
            // endDate:new Date()
        });
        $('#date2').datepicker({
            format:'dd/mm/yyyy',
           startDate:new Date()
            // endDate:new Date()
        });
       

        
    });
}

function lireMoinsEtPlus(){
    document.querySelectorAll(".lire-plus").forEach(function (boutton){
        boutton.addEventListener("click",function(){
            const parent=boutton.parentElement;
            const tronque=parent.querySelector(".suivi-tronque");
            const complet=parent.querySelector(".suivi-complet")
            if(complet.style.display==="none"){
                tronque.style.display="none";
                complet.style.display="inline";
                boutton.textContent="Lire moins";

            }else{
                tronque.style.display="inline";
                complet.style.display="none";
                boutton.textContent="Lire plus";
            }
        });
    });
}