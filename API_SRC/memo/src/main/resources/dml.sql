--
-- PostgreSQL database dump
--

-- Dumped from database version 13.8
-- Dumped by pg_dump version 13.8



--
-- Data for Name: mst_device; Type: TABLE DATA; Schema: memos_schema; Owner: -
--



--
-- Data for Name: mst_group; Type: TABLE DATA; Schema: memos_schema; Owner: -
--

INSERT INTO memos_schema.mst_group VALUES ('e478fda6-2555-ca56-a92b-3b54330ef01b', 'GroupA', 'GroupA', '2022-10-26 00:59:03.972');
INSERT INTO memos_schema.mst_group VALUES ('48637adf-3645-0757-2543-6a8de793e36d', 'GroupB', 'GroupB', '2022-10-26 00:59:03.972');
INSERT INTO memos_schema.mst_group VALUES ('9e413df2-1715-4312-4cb1-3c3c173856a4', 'GroupC', 'GroupC', '2022-10-26 00:59:03.972');


--
-- Data for Name: mst_operation; Type: TABLE DATA; Schema: memos_schema; Owner: -
--



--
-- Data for Name: mst_role; Type: TABLE DATA; Schema: memos_schema; Owner: -
--



--
-- Data for Name: mst_user; Type: TABLE DATA; Schema: memos_schema; Owner: -
--

INSERT INTO memos_schema.mst_user VALUES ('c6a5ce92-c026-73c5-2bf6-ee383468d1bc', 'Alice', 'Alice is a fictional character and the main protagonist of Lewis Carroll''s children''s novel Alice''s Adventures in Wonderland (1865) and its sequel, ', '2022-10-26 00:44:04.05', NULL);
INSERT INTO memos_schema.mst_user VALUES ('f34998ef-fbf3-4b6b-795c-d7f004d6584c', 'Wendy', 'Wendy Moira Angela Darling is a fictional character and one of the main protagonists of the 1904 play and 1911 novel Peter and Wendy by J. M. Barrie, as well as in most adaptations in other media. Her exact age is not specified in the original play or novel by Barrie, though it is implied that she is about 12–13 years old or possibly younger, as she is "just Peter''s size". As a girl on the verge of adulthood, she stands in contrast to Peter Pan, a boy who refuses to grow up, the major theme of the Peter Pan stories. Wendy hesitates at first to fly off to Neverland, but she comes to enjoy her adventures. Ultimately, she chooses to go back to her parents and accepts that she has to grow up.', '2022-10-26 00:41:39.16', NULL);
INSERT INTO memos_schema.mst_user VALUES ('486483f3-c67d-813e-6f61-d25aa4463b10', 'Oscar', 'Oscar Fingal O''Flahertie Wills Wilde (16 October 1854 – 30 November 1900) was an Irish poet and playwright. After writing in different forms throughout the 1880s, he became one of the most popular playwrights in London in the early 1890s. He is best remembered for his epigrams and plays, his novel The Picture of Dorian Gray, and the circumstances of his criminal conviction for gross indecency for consensual homosexual acts in "one of the first celebrity trials",[1] imprisonment, and early death from meningitis at age 46.', '2022-10-26 00:39:14.275', NULL);
INSERT INTO memos_schema.mst_user VALUES ('8af0763a-51ea-60b1-7d16-5fcc7b40cc2e', 'Queen', 'The Queen of Hearts is a fictional character and the main antagonist in the 1865 book Alice''s Adventures in Wonderland by Lewis Carroll. She is a childish, foul-tempered monarch whom Carroll himself describes as "a blind fury", and who is quick to give death sentences at the slightest offense.', '2022-10-26 00:36:49.39', NULL);
INSERT INTO memos_schema.mst_user VALUES ('dc9b4398-2ad6-5c9c-6a9c-1b99e037c2bc', 'Bob', 'Robert Nesta Marley OM (6 February 1945 – 11 May 1981; baptised in 1980 as Berhane Selassie) was a Jamaican singer, musician, and songwriter. Considered one of the pioneers of reggae, his musical career was marked by fusing elements of reggae, ska, and rocksteady, as well as his distinctive vocal and songwriting style.', '2022-10-26 00:46:28.931', NULL);
INSERT INTO memos_schema.mst_user VALUES ('115e4f7c-251e-d2d4-ac78-3a853c89d7e4', 'Victor', '', '2022-10-26 00:34:24.505', NULL);
INSERT INTO memos_schema.mst_user VALUES ('5205d8a4-fcdd-b106-21b9-cbce6886b081', 'Judy', '', '2022-10-26 00:31:59.62', NULL);
INSERT INTO memos_schema.mst_user VALUES ('f6c76bc6-10a7-9d29-233b-6c1dd1868ec5', 'Charlie', 'Charles Parker Jr. (August 29, 1920 – March 12, 1955), nicknamed "Bird" or "Yardbird", was an American jazz saxophonist, band leader and composer.[1] Parker was a highly influential soloist and leading figure in the development of bebop,[2] a form of jazz characterized by fast tempos, virtuosic technique, and advanced harmonies.', '2022-10-26 00:29:34.735', NULL);
INSERT INTO memos_schema.mst_user VALUES ('63527597-4b79-685a-b0d7-8d347a88e1e8', 'Ted', '', '2022-10-26 00:27:09.85', NULL);
INSERT INTO memos_schema.mst_user VALUES ('c320c6d8-6f69-d389-53ef-d47c178d8e11', 'Ivan', '', '2022-10-26 00:24:44.965', NULL);


--
-- Data for Name: rel_device; Type: TABLE DATA; Schema: memos_schema; Owner: -
--



--
-- Data for Name: rel_group; Type: TABLE DATA; Schema: memos_schema; Owner: -
--

INSERT INTO memos_schema.rel_group VALUES ('e478fda6-2555-ca56-a92b-3b54330ef01b', 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('e478fda6-2555-ca56-a92b-3b54330ef01b', 'f34998ef-fbf3-4b6b-795c-d7f004d6584c', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('e478fda6-2555-ca56-a92b-3b54330ef01b', '486483f3-c67d-813e-6f61-d25aa4463b10', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('e478fda6-2555-ca56-a92b-3b54330ef01b', '8af0763a-51ea-60b1-7d16-5fcc7b40cc2e', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('48637adf-3645-0757-2543-6a8de793e36d', 'dc9b4398-2ad6-5c9c-6a9c-1b99e037c2bc', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('48637adf-3645-0757-2543-6a8de793e36d', '115e4f7c-251e-d2d4-ac78-3a853c89d7e4', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('48637adf-3645-0757-2543-6a8de793e36d', '5205d8a4-fcdd-b106-21b9-cbce6886b081', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('48637adf-3645-0757-2543-6a8de793e36d', 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('9e413df2-1715-4312-4cb1-3c3c173856a4', 'f6c76bc6-10a7-9d29-233b-6c1dd1868ec5', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('9e413df2-1715-4312-4cb1-3c3c173856a4', '63527597-4b79-685a-b0d7-8d347a88e1e8', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('9e413df2-1715-4312-4cb1-3c3c173856a4', 'c320c6d8-6f69-d389-53ef-d47c178d8e11', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('9e413df2-1715-4312-4cb1-3c3c173856a4', '486483f3-c67d-813e-6f61-d25aa4463b10', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('9e413df2-1715-4312-4cb1-3c3c173856a4', 'dc9b4398-2ad6-5c9c-6a9c-1b99e037c2bc', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('9e413df2-1715-4312-4cb1-3c3c173856a4', 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc', '2022-10-26 01:01:29.614');
INSERT INTO memos_schema.rel_group VALUES ('9e413df2-1715-4312-4cb1-3c3c173856a4', '5205d8a4-fcdd-b106-21b9-cbce6886b081', '2022-10-26 01:01:29.614');


--
-- Data for Name: rel_operation; Type: TABLE DATA; Schema: memos_schema; Owner: -
--



--
-- Data for Name: rel_role; Type: TABLE DATA; Schema: memos_schema; Owner: -
--



--
-- Data for Name: trn_thread; Type: TABLE DATA; Schema: memos_schema; Owner: -
--

INSERT INTO memos_schema.trn_thread VALUES ('80d59aff-96c9-5c39-3e9b-98102d891857', 'e478fda6-2555-ca56-a92b-3b54330ef01b', 'The Queen’s Croquet-Ground', '2022-10-26 01:05:28.398');
INSERT INTO memos_schema.trn_thread VALUES ('d4a32865-3d77-d130-35fd-08097a2e043b', 'e478fda6-2555-ca56-a92b-3b54330ef01b', 'A Mad Tea-Party', '2022-10-26 01:05:28.398');
INSERT INTO memos_schema.trn_thread VALUES ('da145cf7-3e7c-e394-0644-a87c41027e1d', 'e478fda6-2555-ca56-a92b-3b54330ef01b', 'Goog Night', '2022-10-26 01:05:28.398');
INSERT INTO memos_schema.trn_thread VALUES ('e7c73be4-0355-3465-94d1-fe4c07060639', 'e478fda6-2555-ca56-a92b-3b54330ef01b', 'The Ballad of Reading Gaol.', '2022-10-26 01:05:28.398');
INSERT INTO memos_schema.trn_thread VALUES ('e82a7245-c466-1b93-e6b2-4a5a5dd39866', '48637adf-3645-0757-2543-6a8de793e36d', 'Could You Be Loved', '2022-10-26 01:05:28.398');
INSERT INTO memos_schema.trn_thread VALUES ('9c8071f6-9443-af56-f7da-e67bef13302f', '48637adf-3645-0757-2543-6a8de793e36d', 'Sun Is Shining', '2022-10-26 01:05:28.398');
INSERT INTO memos_schema.trn_thread VALUES ('ebce3a6d-08ce-7499-09d8-1df5edd0dc67', '48637adf-3645-0757-2543-6a8de793e36d', 'Bbb by Alice x xxxx', '2022-11-01 01:05:28.395');


--
-- Data for Name: trn_memo; Type: TABLE DATA; Schema: memos_schema; Owner: -
--

INSERT INTO memos_schema.trn_memo VALUES ('ed84f4b7-347f-f355-d3f6-e920af406ecc', '80d59aff-96c9-5c39-3e9b-98102d891857', 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc', '"My name is Alice, so please your Majesty," said Alice very politely; but she added, to herself, "Why, they''re only a pack of cards, after all. I needn''t be afraid of them!"', '2021-01-14 01:08:45');
INSERT INTO memos_schema.trn_memo VALUES ('8228c9d1-4181-2c4d-1d5c-9f868305239b', '80d59aff-96c9-5c39-3e9b-98102d891857', '8af0763a-51ea-60b1-7d16-5fcc7b40cc2e', '"And who are these?" said the Queen, pointing to the three gardeners who were lying round the rose-tree; for, you see, as they were lying on their faces, and the pattern on their backs was the same as the rest of the pack, she could not tell whether they were gardeners, or soldiers, or courtiers, or three of her own children.', '2022-10-27 01:08:45.185');
INSERT INTO memos_schema.trn_memo VALUES ('c4ea217c-bd14-3d59-ce5e-989356434ab7', '80d59aff-96c9-5c39-3e9b-98102d891857', 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc', '"How should I know?" said Alice, surprised at her own courage. "It''s no business of mine."', '2022-10-28 01:08:45.185');
INSERT INTO memos_schema.trn_memo VALUES ('3bf52610-7bd5-ae92-7021-6e5fb9cdf167', '80d59aff-96c9-5c39-3e9b-98102d891857', '8af0763a-51ea-60b1-7d16-5fcc7b40cc2e', 'The Queen turned crimson with fury, and, after glaring at her for a moment like a wild beast, screamed "Off with her head! Off—"', '2022-10-29 01:08:45.185');
INSERT INTO memos_schema.trn_memo VALUES ('90466865-4a82-7e1f-ac52-095ba244c0b7', '80d59aff-96c9-5c39-3e9b-98102d891857', 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc', '"Nonsense!" said Alice, very loudly and decidedly, and the Queen was silent.', '2022-10-30 01:08:45.185');
INSERT INTO memos_schema.trn_memo VALUES ('5c27984c-a6b5-5d78-1b59-f0e9fbaa9556', 'd4a32865-3d77-d130-35fd-08097a2e043b', 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc', '"Then it wasn''t very civil of you to offer it," said Alice angrily…', '2021-01-15 01:08:45');
INSERT INTO memos_schema.trn_memo VALUES ('c075c02d-21b5-1338-a913-e020ce6fbc4f', 'da145cf7-3e7c-e394-0644-a87c41027e1d', 'f34998ef-fbf3-4b6b-795c-d7f004d6584c', 'Well, a mother, a real mother is the most wonderful person in the world. She''s..', '2021-01-16 01:08:44.995');
INSERT INTO memos_schema.trn_memo VALUES ('47eadbbb-0614-6918-0beb-f1258d8110a8', 'e7c73be4-0355-3465-94d1-fe4c07060639', '486483f3-c67d-813e-6f61-d25aa4463b10', 'He did not wear his scarlet coat,\nFor blood and wine are red,\nAnd blood and...', '2021-01-17 01:08:44.995');
INSERT INTO memos_schema.trn_memo VALUES ('8411f049-4292-bdb7-d3d1-9fd4cd32fca5', 'e82a7245-c466-1b93-e6b2-4a5a5dd39866', 'dc9b4398-2ad6-5c9c-6a9c-1b99e037c2bc', 'Could you be loved and be loved? Could you be loved and be loved? Don''t let them fool ya, Or even try to school ya! Oh, no! We''ve got a mind of our own, So go to hell if what you''re thinking is not right! Love would never leave us alone, A-yin the darkness there must come out to light Could you be loved and be loved? Could you be loved, wo yeah! - and be loved? (The road of life is rocky and you may stumble too, So while you point your fingers someone else is judging you) Love your brother-man! (Could you be - could you be - could you be loved? Could you be - could you be loved? Could you be - could you be - could you be loved? Could you be - could you be loved?) Don''t let them change ya, oh! - Or even rearrange ya! Oh, no! We''ve got a life to live. They say: only - only - Only the fittest of the fittest shall survive - Stay alive! Eh! Could you be loved and be loved? Could you be loved, woah yeah! - and be loved? (You ain''t gonna miss your water until your well runs dry; No matter how you treat him, the man will never be satisfied.) Say something! (Could you be - could you be - could you be loved? Could you be - could you be loved?) Say something! Say something! (Could you be - could you be - could you be loved?) Say something! (Could you be - could you be loved?) Say something! Say something! (Say something!) Say something! Say something! (Could you be loved?) Say something! Say something! Reggae, reggae! Say something! Rockers, rockers! Say something! Reggae, reggae! Say something! Rockers, rockers! Say something! (Could you be loved?) Say something! Uh! Say something! Come on! Say something! (Could you be - could you be - could you be loved?) Say something! (Could you be - could you be loved?) Say something! (Could you be - could you be - could you be loved?) Say something! (Could you be - could you be loved?) [fadeout]', '2021-01-18 01:08:44.995');
INSERT INTO memos_schema.trn_memo VALUES ('54eac4da-57d8-7b0d-cbce-5f217d8b49db', '9c8071f6-9443-af56-f7da-e67bef13302f', 'dc9b4398-2ad6-5c9c-6a9c-1b99e037c2bc', 'Sun is shining, the weather is sweet Make you want to move your dancing feet To the rescue, here I am Want you to know, y''all, where I stand (Monday morning) Here I am Want you to know just if you can (Tuesday evening) Where I stand (Wednesday morning) Tell myself a new day is rising (Thursday evening) Get on the rise, a new day is dawning (Friday morning) Here I am (Saturday evening) Want you to know just Want you to know just where I stand When the morning gathers the rainbow Want you to know I''m a rainbow too So, to the rescue, here I am Want you to know just if you can Where I stand No, no, no, no, no, no, no, no We''ll lift our heads and give Jah praises We''ll lift our heads and give Jah praises, yeah Sun is shining, weather is sweet Make you want to move your dancing feet To the rescue, here I am Want you to know just if you can Where I stand No, no, no, no, where I stand (Monday morning) Scoo-ba doop scoop-scoop (Tuesday evening) Scoo-ba doop scoop-scoop (Wednesday morning) Scoo-ba doop scoop-scoop (Thursday evening) Scoo-ba doop scoop-scoop (Friday morning) Scoo-ba doop scoop-scoop (Saturday evening) A-scoo-ba doop scoop-scoop So, to the rescue To the rescue To the rescue, alright Sun is shining Sun is shining Sun is shining', '2021-01-19 01:08:44.995');
INSERT INTO memos_schema.trn_memo VALUES ('5a7ce4f3-6632-3caa-9c47-4b853f7cd946', 'ebce3a6d-08ce-7499-09d8-1df5edd0dc67', 'c6a5ce92-c026-73c5-2bf6-ee383468d1bc', 'Bbb Alice xxx xxxxx xxxxx xxxxxx xxxxxx  xxx xxx x xxxx xx xxxx xxxx …', '2021-01-20 01:08:44.99');


--
-- PostgreSQL database dump complete
--

