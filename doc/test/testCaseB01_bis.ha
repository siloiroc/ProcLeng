-- funciones paso por valor


procedure testCase08 () is

z: Integer;
a,b: Integer;

function suma (x,y: Integer) return Integer is
begin
	return x + y;
end suma;

procedure imprimeSuma () is
w: Integer;
begin
	w:=8;		
--	Put_line("w(8):");
	Put_line(w);

end suma;


begin
	Put_line ("SUBPROGRAMAS PROCEDIMIENTO");
	imprimeSuma ();

end testCase08;
