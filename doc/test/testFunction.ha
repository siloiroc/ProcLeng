-- test Funciones

procedure testCase08 () is

z: Integer;

a,b: Integer;

function suma (x,y: Integer) RETURN Integer is
type Tpersona is record
	dni: Integer;
	edad: Integer;
	casado: Boolean;
end record;

yo: Tpersona;

begin
	return x + y;
	Put_line("prueba");		
end suma;





begin

end testCase08;
