procedure testCase07 () is

CIERTO: constant := True;

a: Integer;
b: Integer;
c,d:Boolean;
e:Integer;

function suma (x,y: Integer) return Integer is
begin
		
	return x+y;	

end resta;

procedure imprimeTxt (x,y:Integer) is
z:Integer;
begin
	Put_line("hola ");
	Put_line("Mundo");
	z:=1;
	Put_line(z);
end imprimeTxt;

begin
	c:=true;
	a:=2; 
	e:=3;
	Put_line ("SUBPROGRAMAS FUNCIONES");
	imprimeTxt(1, 2);
	b:= a + e;
end testCase07;