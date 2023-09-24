-- Mengambil Semua Aktor untuk Sebuah Film Tertentu
select
    a.first_name,
    a.last_name
from
    film_actor as fa
inner join
    actor as a on fa.actor_id = a.actor_id
where
    fa.film_id = 10;
