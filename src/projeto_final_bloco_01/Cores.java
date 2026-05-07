package projeto_final_bloco_01;

public class Cores {

	// Reset de Cor (sempre use no final do texto para não colorir o console inteiro)
	public static final String TEXT_RESET = "\u001B[0m";

	// Cores do Texto (Negrito)
	public static final String TEXT_YELLOW_BOLD = "\033[1;33m";
	public static final String TEXT_WHITE_BOLD = "\033[1;37m";
	public static final String TEXT_CYAN_BOLD = "\033[1;36m";
	public static final String TEXT_RED_BOLD = "\033[1;31m"; // Ótimo para mensagens de erro
	public static final String TEXT_PURPLE_BOLD = "\033[1;35m";

	// Cores de Fundo (Background)
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
}