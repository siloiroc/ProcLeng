procedure testCase03 () is

CIERTO: constant := True;

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


x, y: Integer;
	
begin

x:= 1 + 2;

end testCase03;