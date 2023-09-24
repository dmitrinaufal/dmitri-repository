--  Mengambil Semua Film yang Tersedia Berdasarkan Bahasa (Language)
select
    f.title as film_title,
    l.name as language
from
    film as f
inner join
    language as l on f.language_id = l.language_id;

-- Mengambil Data yang Menunjukkan Jumlah Film untuk Setiap Kategori (Category):
select
    c.name as category,
    count (f.film_id) AS jumlah_film
from
    film as f
inner join
    film_category AS fc ON f.film_id = fc.film_id
inner join
    category as c on fc.category_id = c.category_id
group by
    c.name
order by
    jumlah_film asc;

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
