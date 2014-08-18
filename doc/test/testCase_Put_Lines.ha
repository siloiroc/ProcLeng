-- salida 

procedure testCase02 () is

type Tpersona is record
	dni: Integer;
	edad: Integer;
	casado: Boolean;
end record;

type Tfecha is record
	dia: Integer;
	mes: Integer;
	anyo: Integer;
end record;

type Tcita is record
	usuario: Tpersona;
	fecha:	Tfecha;
end record;

x: Integer;
y: Boolean;


begin
	x := 2;
--	yo.edad := 37;
--	yo.dni  := 1234;
--	yo.casado := false;
--	cita1.usuario := yo;
--	cita1.usuario.edad := 45;
--	Put_line(1);					-- Muestra 1
--	Put_line(x); 					-- Muestra el valor de la variable x
--	Put_line(x+1);					-- Muestra el valor de la variable x + 1
--	Put_line(yo.edad);
--	Put_line(cita1.usuario.edad); 	-- Muestra el valor del campo correspondiente del registro
--	Put_line(True);					-- Muestra el texto true
--	Put_line(False);				-- Muestra el texto false
--	Put_line("Hola Mundo!");		-- Muestra el texto Hola mundo
--	Put_line(a,b);					-- ERROR. Sólo se admite un parámetro
--	Put_line(cita1);				-- ERROR. No se muestran tipos compuestos
	

end testCase02;
