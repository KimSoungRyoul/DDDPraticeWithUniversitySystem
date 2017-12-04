package org.pre.application;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.pre.domain.course.CompletionType;
import org.pre.domain.course.Course;
import org.pre.domain.course.CreditPointStructere;
import org.pre.domain.course_registration.RealCourseRegistration;
import org.pre.domain.lecture.BuildingType;
import org.pre.domain.lecture.Lecture;
import org.pre.domain.lecture.LectureRoom;
import org.pre.domain.member.Gender;
import org.pre.domain.member.MemberInfo;
import org.pre.domain.member.Nationality;
import org.pre.domain.member.RoleType;
import org.pre.domain.member.authorication.GrantedAuthority;
import org.pre.domain.member.professor.Professor;
import org.pre.domain.member.student.AcademicPerformance;
import org.pre.domain.member.student.AquiredGrade;
import org.pre.domain.member.student.DegreeState;
import org.pre.domain.member.student.Student;
import org.pre.domain.member.student.StudentInfo;
import org.pre.domain.member.student.UniverseDepartment;
import org.pre.domain.member.student.UniversityGrade;
import org.pre.repository.AcadimicPerformanceRepository;
import org.pre.repository.AuthorityRepository;
import org.pre.repository.CourseRepository;
import org.pre.repository.LectureRepository;
import org.pre.repository.LectureRoomRepository;
import org.pre.repository.MemberInfoRepository;
import org.pre.repository.ProfessorRepository;
import org.pre.repository.RealCourseRegistrationRepository;
import org.pre.repository.StudentRepository;
import org.pre.repository.UniverseDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class InitService {

	private CourseRepository courseRepository;

	private LectureRepository lectureRepository;

	private ProfessorRepository professorRepository;

	private RealCourseRegistrationRepository rCourseRegRepository;

	private StudentRepository studentRepository;

	private UniverseDepartmentRepository uDepartmentRepository;

	private AcadimicPerformanceRepository acPerformRepository;

	private AuthorityRepository authRepository;

	private MemberInfoRepository mInfoRepository;


	
	private LectureRoomRepository lectureRoomRepository;

	
	
	
	
	
	@Autowired
	public InitService(CourseRepository courseRepository, LectureRepository lectureRepository,
			ProfessorRepository professorRepository, RealCourseRegistrationRepository rCourseRegRepository,
			StudentRepository studentRepository, UniverseDepartmentRepository uDepartmentRepository,
			AcadimicPerformanceRepository acPerformRepository, AuthorityRepository authRepository,
			MemberInfoRepository mInfoRepository, 
			LectureRoomRepository lectureRoomRepository) {
		super();
		this.courseRepository = courseRepository;
		this.lectureRepository = lectureRepository;
		this.professorRepository = professorRepository;
		this.rCourseRegRepository = rCourseRegRepository;
		this.studentRepository = studentRepository;
		this.uDepartmentRepository = uDepartmentRepository;
		this.acPerformRepository = acPerformRepository;
		this.authRepository = authRepository;
		this.mInfoRepository = mInfoRepository;
		//this.sInfoRepository = sInfoRepository;
		this.lectureRoomRepository = lectureRoomRepository;
	}







	@PostConstruct
	@Transactional
	public void init() {

		UniverseDepartment CE = new UniverseDepartment(024125L, "ComputerEngineering", "031-123-3455");
		UniverseDepartment iTBizz = new UniverseDepartment(024125L, "ITBusiness", "031-454-2354");

		uDepartmentRepository.save(CE);
		CE=uDepartmentRepository.findByUDepartmentName("ComputerEngineering");
		
		uDepartmentRepository.save(iTBizz);
		iTBizz=uDepartmentRepository.findByUDepartmentName("ITBusiness");
		

		Professor professorHan = new Professor("한익주",
				uDepartmentRepository.findByUDepartmentName("ComputerEngineering"), "SoftwareArchiture",
				"SOA PaaS IaaS 같은 내용들 ....");
		professorHan.setMemberEmail("han023@kpu.ac.kr");
		professorHan.setMemberId(null);

		MemberInfo mInfoHan = new MemberInfo(null, "한익주", "Hanaaaaa", "870823-10123", new Date(19930823L), Gender.MAN,
				Nationality.KOREA, "01072376602", "02432123", "Hanhh@gmail.com");
		mInfoRepository.save(mInfoHan);
		
		
		professorHan.setMemberInfo(mInfoRepository.findByNameWithKorean("한익주"));

		GrantedAuthority gauth1 = new GrantedAuthority(null, new Date(), RoleType.PROFESSOR, professorHan);

		Set<GrantedAuthority> authorities1 = new HashSet<>();
		authorities1.add(gauth1);

		professorHan.setAuthorities(authorities1);
		professorHan.setPassword("12341234");
		professorHan.setMemberEmail("han1203");

		professorRepository.save(professorHan);
		authRepository.save(gauth1);
		professorHan=professorRepository.findByName("한익주");

		// --------------------------------------------------------------------------------

		Professor professorBea = new Professor("이태서",
				uDepartmentRepository.findByUDepartmentName("ComputerEngineering"), "AI", "영상처리 패턴인식 관련 분야");
		professorBea.setMemberEmail("Bea023@kpu.ac.kr");
		professorBea.setMemberId(null);

		MemberInfo mInfoBea = new MemberInfo(null, "이태서", "Hanaaaaa", "860823-10123", new Date(19930823L), Gender.MAN,
				Nationality.KOREA, "01014", "02431253", "KiBea@gmail.com");
		mInfoRepository.save(mInfoBea);
		
		professorBea.setMemberInfo(mInfoRepository.findByNameWithKorean("이태서"));

		GrantedAuthority gauth2 = new GrantedAuthority(null, new Date(), RoleType.PROFESSOR, professorBea);
		authRepository.save(gauth2);
		
		Set<GrantedAuthority> authorities2 = new HashSet<>();
		authorities1.add(gauth2);
		
		
		professorBea.setAuthorities(authorities2);
		professorBea.setPassword("12341234");
		professorBea.setMemberEmail("bbb1203");

		professorRepository.save(professorBea);
		
		professorBea=professorRepository.findByName("이태서");
		
		
		
		
		
		
		
		
		
		
		
		

		StudentInfo sInfo = new StudentInfo(UniversityGrade.junior, DegreeState.UndergraduateCourses, CE,
				iTBizz, professorHan);
		/*sInfoRepository.save(sInfo);
		
		sInfo=sInfoRepository.findByDState(DegreeState.UndergraduateCourses);*/
		
		
		
		
		
		Course discreteMathematics = new Course(02344L, CompletionType.REQUIREDBASICMAJOR, "이산수학",
				new CreditPointStructere(3, 0, 0), true, false);
		Course embeddedProgramming = new Course(05634L, CompletionType.REQUIREDMAJOR, "임베디드프로그래밍",
				new CreditPointStructere(3, 3, 0), true, false);
		Course imageProcessing = new Course(05612L, CompletionType.REQUIREDMAJOR, "데이터베이스개론",
				new CreditPointStructere(3, 1, 0), false, false);
		Course webProgramming = new Course(05612L, CompletionType.SELECTMAJOR, "운영체제",
				new CreditPointStructere(3, 0, 0), false, false);

		courseRepository.save(discreteMathematics);
		courseRepository.save(embeddedProgramming);
		courseRepository.save(imageProcessing);
		courseRepository.save(webProgramming);

		discreteMathematics=courseRepository.findBySubjectTitle("이산수학");
		embeddedProgramming=courseRepository.findBySubjectTitle("임베디드프로그래밍");
		imageProcessing=courseRepository.findBySubjectTitle("데이터베이스개론");
		webProgramming=courseRepository.findBySubjectTitle("운영체제");
		
		/*
		 * 
		 * 여기까지 가능함 이후  디버깅하기 ........................
		 * 
		 * 
		 * */
		
		
		
		
		
		AcademicPerformance acPerfo1 = new AcademicPerformance(031L, 3, 2, discreteMathematics, AquiredGrade.Bplus,
				false);
		AcademicPerformance acPerfo2 = new AcademicPerformance(024L, 3, 2, embeddedProgramming, AquiredGrade.A, false);

		acPerformRepository.save(acPerfo1);
		acPerformRepository.save(acPerfo2);
		
		acPerfo1=acPerformRepository.findByAquiredGrade(AquiredGrade.Bplus);
		acPerfo2= acPerformRepository.findByAquiredGrade(AquiredGrade.A);
		
		
		List<AcademicPerformance> acList = new LinkedList<>();
		acList.add(acPerfo1);
		acList.add(acPerfo2);

		RealCourseRegistration rcr = new RealCourseRegistration(10, 27, 23, 29, 89, "가야산천년수 반포리523-4..");
		rcr.setCourseRegId(01230L);
		rcr.setMaxCreditPoints(21);

		

		LectureRoom lRoom = new LectureRoom(null, BuildingType.E, 412);
		
		
		
		lectureRoomRepository.save(lRoom);
		
		lRoom=lectureRoomRepository.findByClazzNum(412);
		
		log.debug(lRoom.getClazzNum() +"-----------------------------");
		
		Lecture lecture1 = new Lecture(null, professorBea, imageProcessing, 
				"월0102,수0304", lRoom, "도망쳐... 겁나 어려워 ...");
		lectureRepository.save(lecture1);
		

		

		
		
		LectureRoom lRoom2 = new LectureRoom(null, BuildingType.종합관, 407);
		lectureRoomRepository.save(lRoom2);
		lRoom2=lectureRoomRepository.findByClazzNum(407);
		
		Lecture lecture2 = new Lecture(null, professorHan, webProgramming, "월0203,금0708", lRoom2, "지루해 ...");

		lectureRepository.save(lecture2);

		Set<Lecture> lectureSet = new HashSet<>(lectureRepository.findAll());
		
		
		
		
		rcr.setRegisteredLecture(lectureSet);

		rCourseRegRepository.save(rcr);

		rcr=rCourseRegRepository.findAll().get(0);
		
		List<RealCourseRegistration> rcrList = new LinkedList<>();
		rcrList.add(rcr);

		byte[] profilePhoto = { (byte) 0101010, (byte) 010101010 };

		Student student = new Student(profilePhoto, CE, sInfo, acList, rcrList);

		student.setMemberEmail("sky5367@kpu.ac.kr");
		student.setMemberId(null);
		student.setPassword("12341234");
		student.setMemberEmail("sky5367");
	
		
		
		MemberInfo mInfo = new MemberInfo(01011L, "김성렬", "KimSoungRyoul", "930823-10123", new Date(19930823L),
				Gender.MAN, Nationality.KOREA, "01072376602", "02432123", "KimSoungRyoul@gmail.com");
		mInfoRepository.save(mInfo);
		
		mInfo=mInfoRepository.findByNameWithKorean("김성렬");
		
		student.setMemberInfo(mInfo);
		
		
		//student=studentRepository.findByUDepartmentUDepartmentName("ComputerEngineering");
		
		GrantedAuthority gauth = new GrantedAuthority(null, new Date(), RoleType.STUDENT, student);

		authRepository.save(gauth);
		
		studentRepository.save(student);
		
		//student.setMemberInfo(mInfo);
		
		
		gauth=authRepository.findByAuthorityOwnerMemberEmail("KimSoungRyoul@gmail.com");
		
		Set<GrantedAuthority> authorities = new HashSet<>();
		authorities.add(gauth);

		student.setAuthorities(authorities);
		
		studentRepository.save(student);
		
		rcr.setRegistrationOwner(student);

		rCourseRegRepository.save(rcr);
		
		

	}

}
