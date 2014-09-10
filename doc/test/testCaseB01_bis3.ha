-- constantes  

procedure testCase03 () is

CIERTO: constant := True;
FALSO: constant := False;
UNO: constant := 50;

a: Integer; 

begin

	Put_line("CONSTANTES");

	Put_line("CIERTO(true):");
        Put_line(CIERTO);

	Put_line("FALSO(false):");
        Put_line(FALSO);

	Put_line("UNO(1):");
        Put_line(UNO);

	a:= 100 + 1;
	Put_line(a);
end testCase03;