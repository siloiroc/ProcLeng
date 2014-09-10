
-- tipos estructurados REGISTROS


procedure testCase07 () is

	type Tpersona is record
		dni,juan, pepe, luis: Integer;
		casado, soltero, divorciado, viudo: Boolean;
	end record;
	
--	type Tfecha is record
--		dia: Integer;
--		mes: Integer;
--		anyo: Integer;
--	end record;
	
--	type Tcita is record
--		usuario: Tpersona;
--		fecha:	 Tfecha;
--	end record;
	
--	c1: Tcita;
	x: Integer;
	y: Integer;
	p1 : Tpersona;	
--	x, y: Integer;
--	d: Boolean;



begin

	Put_line("REGISTROS");	

--	x:= 12345;
--	Put_line(x);
	
	p1.luis:=456;
--	p1.casado:=False;
--	p1.soltero:=False;
--	p1.juan:= 3;
--	p1.luis:= 5;
 		
			
--	Put_line("dni(12345):");
--	Put_line(p1.luis);
--	Put_line("casado(false):");
--	Put_line(p1.casado);


end testCase07;