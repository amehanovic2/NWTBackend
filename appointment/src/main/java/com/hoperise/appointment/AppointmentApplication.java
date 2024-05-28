package com.hoperise.appointment;

import com.hoperise.appointment.exception.EventInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class AppointmentApplication {
//	@Autowired
//	AppointmentRepository appointmentRepository;
//
//	@Autowired
//	ReviewRepository reviewRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppointmentApplication.class, args);
	}

	@Bean
	public EventInterceptor customInterceptor() {return new EventInterceptor(); }

//	@Override
//	public void run(String... arg) {
//		appointmentRepository.deleteAll();
//		reviewRepository.deleteAll();
//
//		var creationDate = LocalDateTime.now();
//		var createdBy = "Adna";
//		var appointments = new ArrayList<Appointment>();
//		appointments.add(new Appointment(LocalDate.of(2024, 3, 25), LocalTime.of(9,0), AppointmentStatus.AVAILABLE, null,1L, creationDate,createdBy));
//		appointments.add(new Appointment(LocalDate.of(2024, 3, 25),LocalTime.of(9, 30), AppointmentStatus.AVAILABLE, null,2L, creationDate,createdBy));
//		appointments.add(new Appointment(LocalDate.of(2024, 3, 26),LocalTime.of(10, 0), AppointmentStatus.AVAILABLE, null,1L, creationDate,createdBy));
//		appointments.add(new Appointment(LocalDate.of(2024, 3, 27),LocalTime.of(11, 30), AppointmentStatus.CANCELLED, 1L,1L, creationDate,createdBy));
//		appointments.add(new Appointment(LocalDate.of(2024, 4, 1),LocalTime.of(12, 0), AppointmentStatus.BOOKED, 2L,2L, creationDate,createdBy));
//		appointments.add(new Appointment(LocalDate.of(2024, 4, 1),LocalTime.of(13, 0), AppointmentStatus.AVAILABLE, null,3L, creationDate,createdBy));
//		appointments.add(new Appointment(LocalDate.of(2024, 4, 2),LocalTime.of(10, 0), AppointmentStatus.BOOKED, 3L,3L, creationDate,createdBy));
//
//		appointmentRepository.saveAll(appointments);
//
//		var reviews = new ArrayList<Review>();
//		reviews.add(new Review(5, "Excellent service!", appointments.get(6)));
//		reviews.add(new Review(4, "Good experience overall.", appointments.get(0)));
//		reviews.add(new Review(3, "Could be better.", appointments.get(1)));
//		reviews.add(new Review(5, "Highly recommend!", appointments.get(2)));
//		reviews.add(new Review(2, "Disappointed with the service.", appointments.get(5)));
//
//		reviewRepository.saveAll(reviews);
//	}
}

