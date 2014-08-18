/* The following code was generated by JFlex 1.4.1 on 17/08/14 22:01 */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 17/08/14 22:01 from the specification file
 * <tt>D:/Users/agilrod/git/ProcLeng/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 1;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  3,  3, 35,  0,  3, 36,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3,  0,  5,  0,  0,  0,  0,  0, 26, 27,  0, 32, 29,  4, 28,  0, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 31, 30,  0, 34, 33,  0, 
     0, 14,  7, 15, 18,  8, 19,  9, 23, 10,  1,  1, 13,  1, 11, 12, 
    22,  1, 20, 16, 17, 21,  1,  1,  1, 24,  1,  0, 25,  0,  0,  6, 
     0, 14,  7, 15, 18,  8, 19,  9, 23, 10,  1,  1, 13,  1, 11, 12, 
    22,  1, 20, 16, 17, 21,  1,  1,  1, 24,  1,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\0\1\2\1\3\1\4\1\1\2\2\12\3"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\3\17\1\20\1\0\1\21\4\3\1\22"+
    "\1\23\1\24\1\25\13\3\1\26\1\27\2\0\1\30"+
    "\2\3\1\31\7\3\1\32\10\3\1\33\1\3\1\34"+
    "\1\3\1\35\1\36\1\37\6\3\1\40\3\3\1\41"+
    "\11\3\1\42\1\43\2\3\1\44\1\45\4\3\1\46"+
    "\1\47\1\3\1\50\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[119];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\u0197\0\u01bc\0\u01e1\0\u0206\0\u022b"+
    "\0\u0250\0\u0275\0\112\0\112\0\112\0\u029a\0\112\0\112"+
    "\0\u02bf\0\112\0\112\0\112\0\u02e4\0\112\0\u0309\0\112"+
    "\0\u0103\0\112\0\u032e\0\u0353\0\u0378\0\u039d\0\u03c2\0\157"+
    "\0\157\0\157\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b\0\u04a0"+
    "\0\u04c5\0\u04ea\0\u050f\0\u0534\0\u0559\0\112\0\112\0\u02e4"+
    "\0\u0309\0\112\0\u057e\0\u05a3\0\157\0\u05c8\0\u05ed\0\u0612"+
    "\0\u0637\0\u065c\0\u0681\0\u06a6\0\157\0\u06cb\0\u06f0\0\u0715"+
    "\0\u073a\0\u075f\0\u0784\0\u07a9\0\u07ce\0\157\0\u07f3\0\157"+
    "\0\u0818\0\157\0\157\0\157\0\u083d\0\u0862\0\u0887\0\u08ac"+
    "\0\u08d1\0\u08f6\0\157\0\u091b\0\u0940\0\u0965\0\157\0\u098a"+
    "\0\u09af\0\u09d4\0\u09f9\0\u0a1e\0\u0a43\0\u0a68\0\u0a8d\0\u0ab2"+
    "\0\157\0\157\0\u0ad7\0\u0afc\0\157\0\157\0\u0b21\0\u0b46"+
    "\0\u0b6b\0\u0b90\0\157\0\157\0\u0bb5\0\157\0\157";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[119];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\3\1\11"+
    "\1\12\1\4\1\13\1\4\1\14\1\15\1\4\1\16"+
    "\1\4\1\17\1\4\1\20\1\21\1\4\1\22\2\4"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\2\6\43\35\1\36\1\37\46\0\2\4"+
    "\3\0\23\4\16\0\1\5\45\0\1\6\37\0\2\6"+
    "\4\0\1\40\40\0\5\41\1\42\37\41\1\0\2\4"+
    "\3\0\2\4\1\43\3\4\1\44\14\4\15\0\2\4"+
    "\3\0\5\4\1\45\1\4\1\46\13\4\15\0\2\4"+
    "\3\0\5\4\1\47\4\4\1\50\2\4\1\51\5\4"+
    "\15\0\2\4\3\0\16\4\1\52\4\4\15\0\2\4"+
    "\3\0\6\4\1\53\14\4\15\0\2\4\3\0\6\4"+
    "\1\54\14\4\15\0\2\4\3\0\16\4\1\55\2\4"+
    "\1\56\1\57\15\0\2\4\3\0\6\4\1\60\1\4"+
    "\1\61\6\4\1\62\3\4\15\0\2\4\3\0\2\4"+
    "\1\63\20\4\15\0\2\4\3\0\16\4\1\64\1\65"+
    "\3\4\50\0\1\66\52\0\1\67\2\0\43\70\1\0"+
    "\1\71\43\70\1\72\1\71\1\0\2\4\3\0\3\4"+
    "\1\73\17\4\15\0\2\4\3\0\6\4\1\74\14\4"+
    "\15\0\2\4\3\0\14\4\1\75\6\4\15\0\2\4"+
    "\3\0\12\4\1\76\10\4\15\0\2\4\3\0\13\4"+
    "\1\77\7\4\15\0\2\4\3\0\6\4\1\100\14\4"+
    "\15\0\2\4\3\0\5\4\1\101\15\4\15\0\2\4"+
    "\3\0\17\4\1\102\3\4\15\0\2\4\3\0\2\4"+
    "\1\103\20\4\15\0\2\4\3\0\20\4\1\104\2\4"+
    "\15\0\2\4\3\0\16\4\1\105\4\4\15\0\2\4"+
    "\3\0\7\4\1\106\13\4\15\0\2\4\3\0\5\4"+
    "\1\107\15\4\15\0\2\4\3\0\11\4\1\110\1\4"+
    "\1\111\7\4\15\0\2\4\3\0\6\4\1\112\14\4"+
    "\15\0\2\4\3\0\13\4\1\113\7\4\15\0\2\4"+
    "\3\0\4\4\1\114\16\4\15\0\2\4\3\0\7\4"+
    "\1\115\13\4\15\0\2\4\3\0\2\4\1\116\20\4"+
    "\15\0\2\4\3\0\2\4\1\117\20\4\15\0\2\4"+
    "\3\0\20\4\1\120\2\4\15\0\2\4\3\0\12\4"+
    "\1\121\10\4\15\0\2\4\3\0\2\4\1\122\20\4"+
    "\15\0\2\4\3\0\5\4\1\123\15\4\15\0\2\4"+
    "\3\0\2\4\1\124\20\4\15\0\2\4\3\0\12\4"+
    "\1\125\10\4\15\0\2\4\3\0\11\4\1\126\11\4"+
    "\15\0\2\4\3\0\6\4\1\127\14\4\15\0\2\4"+
    "\3\0\17\4\1\130\3\4\15\0\2\4\3\0\11\4"+
    "\1\131\11\4\15\0\2\4\3\0\1\132\22\4\15\0"+
    "\2\4\3\0\5\4\1\133\15\4\15\0\2\4\3\0"+
    "\2\4\1\134\20\4\15\0\2\4\3\0\3\4\1\135"+
    "\17\4\15\0\2\4\3\0\13\4\1\136\7\4\15\0"+
    "\2\4\3\0\2\4\1\137\20\4\15\0\2\4\3\0"+
    "\13\4\1\140\7\4\15\0\2\4\3\0\16\4\1\141"+
    "\4\4\15\0\2\4\3\0\16\4\1\142\4\4\15\0"+
    "\2\4\3\0\2\4\1\143\20\4\15\0\2\4\3\0"+
    "\7\4\1\144\13\4\15\0\2\4\3\0\10\4\1\145"+
    "\12\4\15\0\2\4\3\0\2\4\1\146\20\4\15\0"+
    "\2\4\3\0\10\4\1\147\12\4\15\0\2\4\3\0"+
    "\4\4\1\150\16\4\15\0\2\4\3\0\14\4\1\151"+
    "\6\4\15\0\2\4\3\0\5\4\1\152\15\4\15\0"+
    "\2\4\3\0\14\4\1\153\6\4\15\0\2\4\3\0"+
    "\4\4\1\154\16\4\15\0\2\4\3\0\5\4\1\155"+
    "\15\4\15\0\2\4\3\0\16\4\1\156\4\4\15\0"+
    "\2\4\3\0\5\4\1\157\15\4\15\0\2\4\3\0"+
    "\6\4\1\160\14\4\15\0\2\4\3\0\17\4\1\161"+
    "\3\4\15\0\2\4\3\0\5\4\1\162\15\4\15\0"+
    "\2\4\3\0\13\4\1\163\7\4\15\0\2\4\3\0"+
    "\5\4\1\164\15\4\15\0\2\4\3\0\16\4\1\165"+
    "\4\4\15\0\2\4\3\0\2\4\1\166\20\4\15\0"+
    "\2\4\3\0\2\4\1\167\20\4\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3034];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\0\1\11\17\1\3\11\1\1\2\11\1\1"+
    "\3\11\1\1\1\11\1\1\1\11\1\0\1\11\23\1"+
    "\2\11\2\0\1\11\75\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[119];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int commentCount = 0;
  
	Token createToken (int id){
		Token token = new Token (id);
    	token.setLine (yyline + 1);
    	token.setColumn (yycolumn + 1);
    	token.setLexema (yytext ());
    	return token;
   	}
  


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 12: 
          { return createToken (sym.PLUS);
          }
        case 42: break;
        case 28: 
          { return createToken (sym.LOOP);
          }
        case 43: break;
        case 37: 
          { return createToken (sym.INTEGER);
          }
        case 44: break;
        case 19: 
          { return createToken (sym.IS);
          }
        case 45: break;
        case 29: 
          { return createToken (sym.TRUE);
          }
        case 46: break;
        case 36: 
          { return createToken (sym.BOOLEAN);
          }
        case 47: break;
        case 4: 
          { return createToken (sym.NUMBER);
          }
        case 48: break;
        case 17: 
          { return createToken (sym.STRING);
          }
        case 49: break;
        case 31: 
          { return createToken (sym.TYPE);
          }
        case 50: break;
        case 32: 
          { return createToken (sym.BEGIN);
          }
        case 51: break;
        case 8: 
          { return createToken (sym.POINT);
          }
        case 52: break;
        case 41: 
          { return createToken (sym.PROCEDURE);
          }
        case 53: break;
        case 27: 
          { return createToken (sym.ELSE);
          }
        case 54: break;
        case 26: 
          { return createToken (sym.FOR);
          }
        case 55: break;
        case 30: 
          { return createToken (sym.THEN);
          }
        case 56: break;
        case 2: 
          { LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
          }
        case 57: break;
        case 10: 
          { return createToken (sym.SEMICOLON);
          }
        case 58: break;
        case 38: 
          { return createToken (sym.CONSTANT);
          }
        case 59: break;
        case 6: 
          { return createToken (sym.LEFTBRACKET);
          }
        case 60: break;
        case 11: 
          { return createToken (sym.COLON);
          }
        case 61: break;
        case 39: 
          { return createToken (sym.FUNCTION);
          }
        case 62: break;
        case 14: 
          { return createToken (sym.EQUAL);
          }
        case 63: break;
        case 1: 
          { /*ignore*/
          }
        case 64: break;
        case 16: 
          { yybegin(COMMENT);
          }
        case 65: break;
        case 23: 
          { return createToken (sym.ASSIGN);
          }
        case 66: break;
        case 3: 
          { return createToken (sym.IDENTIFIER);
          }
        case 67: break;
        case 35: 
          { return createToken (sym.RETURN);
          }
        case 68: break;
        case 20: 
          { return createToken (sym.IF);
          }
        case 69: break;
        case 34: 
          { return createToken (sym.RECORD);
          }
        case 70: break;
        case 7: 
          { return createToken (sym.RIGHTBRACKET);
          }
        case 71: break;
        case 13: 
          { return createToken (sym.GREATTHAN);
          }
        case 72: break;
        case 21: 
          { return createToken (sym.OR);
          }
        case 73: break;
        case 18: 
          { return createToken (sym.IN);
          }
        case 74: break;
        case 22: 
          { return createToken (sym.DOUBLEPOINT);
          }
        case 75: break;
        case 25: 
          { return createToken (sym.END);
          }
        case 76: break;
        case 24: 
          { LexicalError error = new LexicalError();
							error.setLine (yyline + 2);
							error.setColumn (yycolumn - 1);
							error.setLexema (yytext());
							lexicalErrorManager.lexicalDebug("DEBUG - Comment, line = " + yyline + " , column = " + yycolumn + " Text=\"--" + yytext().substring(0,yytext().length() - 2)+ "\"");
							yybegin(YYINITIAL);
          }
        case 77: break;
        case 5: 
          { return createToken (sym.BACKSLASH);
          }
        case 78: break;
        case 9: 
          { return createToken (sym.COMMA);
          }
        case 79: break;
        case 33: 
          { return createToken (sym.FALSE);
          }
        case 80: break;
        case 40: 
          { return createToken (sym.PUTLINE);
          }
        case 81: break;
        case 15: 
          { 
          }
        case 82: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
