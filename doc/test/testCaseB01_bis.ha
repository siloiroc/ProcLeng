
procedure testCase02 () is

CIERTO: constant := True;
FALSO: constant := False;
UNO: constant := 1;

type Tpersona is record
	dni: Integer;
	edad: Integer;
	casado: Boolean;
end record;

type Tfecha is record
	dia: integer;
	mes: integer;
	anyo: integer;
end record;

type Tcita is record
	usuario : Tpersona;
	fecha   : Tfecha;
end record;

x : Integer;
a : Boolean;
yo, tu: Tpersona;
cita : Tcita;

begin

yo.dni := 1234;
yo.edad := 37;
yo.casado := false;

tu.dni := 9999;
tu.edad := 30;
tu.casado := true;


	

end testCase02;
