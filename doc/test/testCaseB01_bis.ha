-- tipos estructurados REGISTROS


procedure testCase07 () is

	type Tpersona is record
		dni,juan: Integer;
		casado: Boolean;
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
	p1 : Tpersona;	
--	x, y: Integer;
--	d: Boolean;

	x: Integer;
begin

--	Put_line("REGISTROS");	

--	x:= 12345;
--	Put_line(x);
	
--	p1.dni:=456;
--	p1.casado:=False;
--	p1.juan:= 3; 		
			
--	Put_line("dni(12345):");
--	Put_line(p1.dni);
--	Put_line("casado(false):");
--	Put_line(p1.casado);


       Put_line ("CRONTROL FLUJO FOR");
	
	x:=0;
	Put_line("x(1,2,3,4,5):");

	for x in 1..5 loop

		Put_line(x);

	end loop;

end testCase07;