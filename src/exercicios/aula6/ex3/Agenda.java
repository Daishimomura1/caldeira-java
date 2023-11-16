package exercicios.aula6.ex3;

    public class Agenda {


        private String nome;
        private String telefone;
        private String endereco;
        private String cidade;

        public Agenda(String nome, String telefone, String endereco, String cidade){
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
            this.cidade = cidade;

        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getCidade() {
            return cidade;
        }

        public String ToString() {
            return "nome: " + nome + "telefone: " + telefone + "endereco: " + endereco + "cidade: " + cidade;
        }
    }