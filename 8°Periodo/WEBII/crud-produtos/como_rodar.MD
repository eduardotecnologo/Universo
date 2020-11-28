Entra na pasta do projeto
Instalar dependências usando composer
$ composer install

Gerar chave para o projeto
$ php artisan key:generate

Configurar conexão com banco de dados (.env)
DB_CONNECTION=mysql
DB_HOST=ip_servidor
DB_PORT=porta_servidor
DB_DATABASE=nome_banco
DB_USERNAME=usuario
DB_PASSWORD=senha

Rodar migrations
$ php artisan migrate

Iniciar servidor para o projeto
$ php artisan Serve
