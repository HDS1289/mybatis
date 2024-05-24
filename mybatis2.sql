drop user mybatis2 cascade;

create user mybatis2 identified by mybatis2 default tablespace users;

grant connect, resource to mybatis2;

create table mybatis2.users(
user_id number(2),
user_name varchar2(12),
reg_date date
);

create table mybatis2.addresses(
user_id number(2),
address varchar2(30)
);

create table mybatis2.posts(
post_id number(3),
post_title varchar2(60),
post_content varchar2(120),
user_id number(2)
);

alter table mybatis2.users
    add constraint user_userid_pk primary key(user_id);
alter table mybatis2.addresses
    add constraint addr_userid_pk primary key(user_id);
alter table mybatis2.posts
    add constraint post_postid_pk primary key(post_id);
    
alter table mybatis2.addresses
    add constraint addr_userid_fk foreign key(user_id)
    references mybatis2.users(user_id);
alter table mybatis2.posts
    add constraint post_userid_fk foreign key(user_id)
    references mybatis2.users(user_id);
    
insert into mybatis2.users
    values(1, 'john', to_date('2024-05-20', 'yyyy-mm-dd'));
insert into mybatis2.users
    values(2, 'terry', to_date('2024-05-23', 'yyyy-mm-dd'));
    
    
insert into mybatis2.addresses
    values(1, '����� ������');
insert into mybatis2.addresses
    values(2, '������ �д籸');
    
insert into mybatis2.posts
    values(101, '���', '�ʿ� ���� �����', 1);
insert into mybatis2.posts
    values(102, '����', '���� ���� �����', 1);
insert into mybatis2.posts
    values(201, '��ġ', '�װ� �־�� ���� ����', 2);
insert into mybatis2.posts
    values(202, '�����', '���г�������� ���� �����̴�.', 2);
insert into mybatis2.posts
    values(203, '���Ҷ�', '�װ� �׸���.', '2');
    
commit;

