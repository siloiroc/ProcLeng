-- tipos estructurados REGISTROS


procedure testCase07 () is

	type Tpersona is record
		dni, pepe, juan: Integer;
		casado: Boolean;
	end record;
	
	type Tfecha is record
		dia: Integer;
		mes: Integer;
		anyo: Integer;
	end record;
	
	type Tcita is record
		usuario: Tpersona;
		fecha:	 Tfecha;
	end record;
	
--	c1: Tcita;
	p1 : Tpersona;	
--	x, y: Integer;
--	d: Boolean;

begin

--	Put_line("REGISTROS");	

--	x:= 12345;
--	Put_line(x);
	
--	p1.dni:=456;
	p1.casado:=False;		
			
--	Put_line("dni(12345):");
--	Put_line(p1.dni);
--	Put_line("casado(false):");
--	Put_line(p1.casado);


end testCase07;