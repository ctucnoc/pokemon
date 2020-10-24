Grid = function(){
    this.id_pre_seleccionado="";
    this.color_enfoque_primario = "";
    this.color_enfoque_secundario = "";
    this.color_desEnfoque = "";
    this.prefijo_fila="";
    this.prefijo_columna="";
    this.eventoChange = function (id_td){   
        if(this.id_pre_seleccionado!=""){
           var pre_check = document.getElementById(this.id_pre_seleccionado); 
           pre_check.checked=false;
           var id_pre = this.id_pre_seleccionado.toString();            
           id_pre = id_pre.substring(id_pre.indexOf(this.prefijo_columna)+this.prefijo_columna.length,id_pre.length);
           var fila_pre = document.getElementById(this.prefijo_fila+id_pre);
           fila_pre.style.backgroundColor = this.color_desEnfoque; 
           this.id_pre_seleccionado=id_td; 
        }else{
          this.id_pre_seleccionado=id_td;              
        }
        var check = document.getElementById(id_td);  
        var id = id_td.toString();            
            id = id.substring(id.indexOf(this.prefijo_columna)+this.prefijo_columna.length,id.length);
        var fila = document.getElementById(this.prefijo_fila+id); 
        if(check.checked){ 
            fila.style.backgroundColor = this.color_enfoque_primario; 
        }else{ 
            fila.style.backgroundColor = this.color_desEnfoque;
            this.id_pre_seleccionado="";
        }             
    };
    this.mouseOver = function (id_tr) {  
        var id = id_tr.toString();            
            id = id.substring(id.indexOf(this.prefijo_fila)+this.prefijo_fila.length,id.length);
        var check = document.getElementById(this.prefijo_columna+id); 
        var fila = document.getElementById(id_tr);
        if(check.checked){ 
            fila.style.backgroundColor = this.color_enfoque_secundario;
        }else{  
            fila.style.backgroundColor = this.color_enfoque_primario;
        } 
    };
    this.mouseOut = function (id_tr) {
        var id = id_tr.toString();            
            id = id.substring(id.indexOf(this.prefijo_fila)+this.prefijo_fila.length,id.length);
        var check = document.getElementById(this.prefijo_columna+id); 
        var fila = document.getElementById(id_tr);
        if(check.checked){ 
            fila.style.backgroundColor = this.color_enfoque_primario;
        }else{  
            fila.style.backgroundColor = this.color_desEnfoque;   
        }  
    };
}




